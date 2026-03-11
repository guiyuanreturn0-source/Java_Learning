package com.bro.learning.project.projectTest1.ui;

import com.bro.learning.project.projectTest1.sound.MusicBG;

import javax.swing.*;
import java.awt.*;

public class MenuFrame extends JFrame {
    private JPanel contentPanel;

    // 构造方法
    public MenuFrame() {
        // 初始化界面
        InitMenu();
        // 初始化上菜单
        InitUpMenu();
        // 设置主菜单背景和主容器
        SetMenuBackground();
        // 添加组件
        SetItems();
        // 事件监听
        //SetListener();
        // 背景音乐
        MusicBG musicBG = new MusicBG();
        String bgPath = "D:\\IideaCode\\IideaProject\\Java_Learning\\src\\com\\bro\\learning\\project\\projectTest1\\sound\\musicOfbg.wav";
        musicBG.startBGM(bgPath);
        this.setVisible(true);
    }


    private void SetItems() {
        // 按钮面板
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS)); // Box垂直布局
        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT); // 居中对齐

        JButton startButton = new JButton("开始~~Hpf的~~奇妙冒险");
        JButton ruleButton = new JButton("冒险规则");
        JButton introButton = new JButton("游戏介绍");
        JButton exitButton = new JButton("退出游戏");

        // 设置按钮样式
        Font buttonFont = new Font("楷体", Font.BOLD, 40);
        startButton.setFont(buttonFont);
        ruleButton.setFont(buttonFont);
        introButton.setFont(buttonFont);
        exitButton.setFont(buttonFont);

        // 设置按钮颜色
        startButton.setBackground(new Color(70, 180, 123));  // 钢蓝色
        startButton.setForeground(Color.WHITE);
        ruleButton.setBackground(new Color(34, 139, 34));    // 森林绿
        ruleButton.setForeground(Color.WHITE);
        introButton.setBackground(new Color(218, 165, 32));  // 金色
        introButton.setForeground(Color.WHITE);
        exitButton.setBackground(new Color(220, 20, 60));    // 深红色
        exitButton.setForeground(Color.WHITE);

        // 设置按钮大小
        startButton.setSize(new Dimension(400, 200));
        ruleButton.setSize(new Dimension(400, 200));
        introButton.setSize(new Dimension(400, 200));
        exitButton.setSize(new Dimension(400, 200));

        // 对齐
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        ruleButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        introButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // 添加到按钮面板
        buttonPanel.add(Box.createVerticalStrut(120));// 增加像素支柱控制间距
        buttonPanel.add(startButton);
        buttonPanel.add(Box.createVerticalStrut(50));
        buttonPanel.add(ruleButton);
        buttonPanel.add(Box.createVerticalStrut(50));
        buttonPanel.add(introButton);
        buttonPanel.add(Box.createVerticalStrut(50));
        buttonPanel.add(exitButton);

        contentPanel.add(buttonPanel);

    }

    private void SetMenuBackground(){
        // 创建主容器
        JPanel backgroundPanel = new JPanel(new BorderLayout());

        // 添加图片
        ImageIcon image = new ImageIcon("src\\com\\bro\\learning\\project\\projectTest1\\image\\menu_backgroud.png");
        JLabel backgroundLabel = new JLabel(image);
        backgroundLabel.setLayout(new BorderLayout());

        // 创建透明容器
        contentPanel = new JPanel();
        contentPanel.setOpaque(false); // 透明
        contentPanel.setLayout(new GridLayout());

        backgroundLabel.add(contentPanel,BorderLayout.NORTH);
        backgroundPanel.add(backgroundLabel,BorderLayout.NORTH);

        // 背景标签容器
        JPanel backgroundContainer = new JPanel(new BorderLayout());
        backgroundContainer.add(backgroundLabel, BorderLayout.NORTH);

        // 将标签容器添加到主容器
        backgroundPanel.add(backgroundContainer, BorderLayout.NORTH);

        // 把主容器设置为当前的内容面板
        this.setContentPane(backgroundPanel);

    }


    private void InitUpMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menu = new JMenu("菜单");
        JMenuItem exit = new JMenuItem("退出游戏");
        exit.setActionCommand("exit");
        exit.addActionListener(e -> exitButtAc());
        menu.add(exit);

        JMenuItem restart = new JMenuItem("重新开始");
        menu.add(restart);
        restart.setActionCommand("restart");
        restart.addActionListener(e -> restartAc());

        JMenu menu2 = new JMenu("关于作者");
        JMenuItem praise = new JMenuItem("赞美作者");
        praise.addActionListener(e -> praiseAc());
        menu2.add(praise);

        JMenuItem criticize = new JMenuItem("拷打作者");
        criticize.setActionCommand("criticize");
        criticize.addActionListener(e -> criticizeAc());
        menu2.add(criticize);

        menuBar.add(menu);
        menuBar.add(menu2);
        this.setJMenuBar(menuBar);
    }

    private void InitMenu() {
        this.setTitle("Hpf的奇妙冒险 v-1.0");
        this.setSize(1000,675);
        // 居中
        this.setLocationRelativeTo(null);
        // 窗口关闭游戏停止
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void exitButtAc(){
        // 弹出确认对话框
        int option = JOptionPane.showConfirmDialog(
                this, // 使用当前窗口作为父窗口
                "确定要退出游戏吗?",
                "退出确认",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void restartAc(){
        int option = JOptionPane.showConfirmDialog(this,"确认要重新开始吗?",
                "退出确认",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            // 实现重新开始
        }
    }

    private void praiseAc(){
        MusicBG praise = new MusicBG();
        String praisePath = "src/com/bro/learning/project/projectTest1/sound/praise.wav";
        praise.playSound(praisePath);
    }

    private void criticizeAc(){
        MusicBG cai = new  MusicBG();
        String caiPath = "src/com/bro/learning/project/projectTest1/sound/hpf.wav";
        cai.playSound(caiPath);
    }
}
