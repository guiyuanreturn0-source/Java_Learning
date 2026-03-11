package com.bro.learning.project.projectTest1.sound;

import javax.sound.sampled.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MusicBG {
    private Clip bgmClip = null;
    private Map<String,Clip> bgms = new HashMap<>();

    public void startBGM(String soundPath) {

        try {
            stopBGM();

            java.io.File file = new java.io.File(soundPath);

            // 尝试获取音频格式信息
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            bgmClip = AudioSystem.getClip();

            bgmClip.open(audioStream);

            audioStream.close();
            bgmClip.loop(Clip.LOOP_CONTINUOUSLY);
            bgmClip.start();

        } catch (Exception e) {
            System.out.println("音乐播放失败!");
        }
    }

    public void stopBGM(){
        if(bgmClip != null){
            bgmClip.stop();
            bgmClip.close();
            bgmClip = null;
            System.out.println("背景音乐已停止");
        }
    }

    public void playSound(String soundPath){
        try {
            Clip soundClip = bgms.get(soundPath);

            if(soundClip == null){
                java.io.File file = new java.io.File(soundPath);
                if (!file.exists()) {
                    System.out.println("错误: 音效文件不存在: " + soundPath);
                    return;
                }

                URL soundURL = file.toURI().toURL();
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
                soundClip = AudioSystem.getClip();
                soundClip.open(audioStream);
                bgms.put(soundPath,soundClip);
            }

            soundClip.setFramePosition(0);
            soundClip.start();
            System.out.println("音效播放成功: " + soundPath);

        } catch (Exception e){
            System.out.println("播放失败: " + e.getMessage());
        }
    }
}