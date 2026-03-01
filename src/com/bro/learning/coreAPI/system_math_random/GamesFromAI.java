package com.bro.learning.coreAPI.system_math_random;

// AI完成了几个使用 Random 的游戏,可做参考学习

import java.util.Random;
import java.util.Scanner;

public class GamesFromAI {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 随机数游戏集合 ===");

        boolean playing = true;
        while (playing) {
            System.out.println("\n请选择游戏:");
            System.out.println("1. 猜数字游戏");
            System.out.println("2. 石头剪刀布");
            System.out.println("3. 掷骰子游戏");
            System.out.println("4. 21点（简化版）");
            System.out.println("5. 老虎机模拟");
            System.out.println("6. 迷宫生成（简单版）");
            System.out.println("0. 退出");
            System.out.print("请选择(0-6): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    guessNumberGame(random, scanner);
                    break;
                case 2:
                    rockPaperScissors(random, scanner);
                    break;
                case 3:
                    diceGame(random, scanner);
                    break;
                case 4:
                    blackjackGame(random, scanner);
                    break;
                case 5:
                    slotMachineGame(random, scanner);
                    break;
                case 6:
                    mazeGenerator(random);
                    break;
                case 0:
                    playing = false;
                    System.out.println("感谢游玩！");
                    break;
                default:
                    System.out.println("无效选择，请重新选择！");
            }
        }

        scanner.close();
    }

    // 1. 猜数字游戏
    private static void guessNumberGame(Random random, Scanner scanner) {
        System.out.println("\n=== 猜数字游戏 ===");
        System.out.print("请输入数字范围（最小值 最大值）: ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        int secretNumber = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("我已选择一个" + min + "到" + max + "之间的数字。");
        System.out.println("你有" + maxAttempts + "次机会猜对这个数字。");

        while (attempts < maxAttempts) {
            System.out.print("第" + (attempts + 1) + "次猜测: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("恭喜！你猜对了！数字是 " + secretNumber);
                System.out.println("你用了 " + attempts + " 次猜对。");
                break;
            } else if (guess < secretNumber) {
                System.out.println("太小了！");
            } else {
                System.out.println("太大了！");
            }

            if (attempts == maxAttempts) {
                System.out.println("很遗憾，你没有猜对。数字是 " + secretNumber);
            }
        }
    }

    // 2. 石头剪刀布
    private static void rockPaperScissors(Random random, Scanner scanner) {
        System.out.println("\n=== 石头剪刀布 ===");
        System.out.println("0: 石头");
        System.out.println("1: 剪刀");
        System.out.println("2: 布");
        System.out.print("请出拳(0-2): ");

        int playerChoice = scanner.nextInt();
        if (playerChoice < 0 || playerChoice > 2) {
            System.out.println("无效选择！");
            return;
        }

        String[] choices = {"石头", "剪刀", "布"};
        int computerChoice = random.nextInt(3);

        System.out.println("你出了: " + choices[playerChoice]);
        System.out.println("电脑出了: " + choices[computerChoice]);

        if (playerChoice == computerChoice) {
            System.out.println("平局！");
        } else if ((playerChoice == 0 && computerChoice == 1) ||  // 石头赢剪刀
                (playerChoice == 1 && computerChoice == 2) ||  // 剪刀赢布
                (playerChoice == 2 && computerChoice == 0)) {  // 布赢石头
            System.out.println("你赢了！");
        } else {
            System.out.println("电脑赢了！");
        }
    }

    // 3. 掷骰子游戏
    private static void diceGame(Random random, Scanner scanner) {
        System.out.println("\n=== 掷骰子游戏 ===");
        System.out.print("你希望用几个骰子?(1-3): ");
        int diceCount = scanner.nextInt();

        if (diceCount < 1 || diceCount > 3) {
            System.out.println("只能使用1-3个骰子！");
            return;
        }

        int playerTotal = 0;
        int computerTotal = 0;

        System.out.print("你的骰子结果: ");
        for (int i = 0; i < diceCount; i++) {
            int dice = random.nextInt(6) + 1;
            playerTotal += dice;
            System.out.print(dice + " ");
        }
        System.out.println("(总和: " + playerTotal + ")");

        System.out.print("电脑的骰子结果: ");
        for (int i = 0; i < diceCount; i++) {
            int dice = random.nextInt(6) + 1;
            computerTotal += dice;
            System.out.print(dice + " ");
        }
        System.out.println("(总和: " + computerTotal + ")");

        if (playerTotal > computerTotal) {
            System.out.println("你赢了！");
        } else if (playerTotal < computerTotal) {
            System.out.println("电脑赢了！");
        } else {
            System.out.println("平局！");

            // 平局时比较最大单个骰子
            int playerMax = random.nextInt(6) + 1;
            int computerMax = random.nextInt(6) + 1;
            System.out.println("平局决胜轮:");
            System.out.println("你的决胜骰子: " + playerMax);
            System.out.println("电脑的决胜骰子: " + computerMax);

            if (playerMax > computerMax) {
                System.out.println("你在决胜轮获胜！");
            } else if (playerMax < computerMax) {
                System.out.println("电脑在决胜轮获胜！");
            } else {
                System.out.println("平局决胜轮也是平局！");
            }
        }
    }

    // 4. 21点（简化版）
    private static void blackjackGame(Random random, Scanner scanner) {
        System.out.println("\n=== 21点（简化版）===");

        int playerScore = 0;
        int computerScore = 0;
        boolean playerBust = false;
        boolean computerBust = false;

        // 玩家回合
        System.out.println("玩家回合:");
        while (true) {
            int card = random.nextInt(10) + 1;  // 1-10
            playerScore += card;
            System.out.println("你抽到: " + card + "，当前总分: " + playerScore);

            if (playerScore > 21) {
                System.out.println("爆牌了！");
                playerBust = true;
                break;
            }

            if (playerScore == 21) {
                System.out.println("21点！");
                break;
            }

            System.out.print("是否继续要牌?(y/n): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }

        // 电脑回合
        System.out.println("\n电脑回合:");
        while (computerScore < 17) {  // 电脑在17点以下必须继续要牌
            int card = random.nextInt(10) + 1;
            computerScore += card;
            System.out.println("电脑抽到: " + card + "，当前总分: " + computerScore);

            if (computerScore > 21) {
                System.out.println("电脑爆牌了！");
                computerBust = true;
                break;
            }
        }

        // 判断胜负
        System.out.println("\n=== 游戏结果 ===");
        System.out.println("你的分数: " + playerScore + (playerBust ? " (爆牌)" : ""));
        System.out.println("电脑分数: " + computerScore + (computerBust ? " (爆牌)" : ""));

        if (playerBust) {
            if (computerBust) {
                System.out.println("双方都爆牌，平局！");
            } else {
                System.out.println("你爆牌了，电脑赢！");
            }
        } else if (computerBust) {
            System.out.println("电脑爆牌了，你赢！");
        } else if (playerScore > computerScore) {
            System.out.println("你赢了！");
        } else if (playerScore < computerScore) {
            System.out.println("电脑赢了！");
        } else {
            System.out.println("平局！");
        }
    }

    // 5. 老虎机模拟
    private static void slotMachineGame(Random random, Scanner scanner) {
        System.out.println("\n=== 老虎机游戏 ===");
        System.out.println("初始资金: 100金币");
        System.out.println("每次游戏花费: 10金币");
        System.out.println("中奖规则:");
        System.out.println("  三个相同: 100金币");
        System.out.println("  两个相同: 20金币");
        System.out.println("  没有相同: 0金币");

        int coins = 100;

        while (coins >= 10) {
            System.out.println("\n当前金币: " + coins);
            System.out.print("是否玩游戏?(y/n): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("y")) {
                break;
            }

            coins -= 10;  // 扣费

            // 生成三个随机符号
            String[] symbols = {"🍒", "🍊", "🍋", "🍉", "⭐", "7️⃣"};
            int[] results = new int[3];

            System.out.print("结果: ");
            for (int i = 0; i < 3; i++) {
                results[i] = random.nextInt(symbols.length);
                System.out.print(symbols[results[i]] + " ");
            }
            System.out.println();

            // 检查中奖
            int winAmount = 0;
            if (results[0] == results[1] && results[1] == results[2]) {
                winAmount = 100;
                System.out.println("🎉 恭喜！三个相同！获得" + winAmount + "金币！");
            } else if (results[0] == results[1] || results[1] == results[2] || results[0] == results[2]) {
                winAmount = 20;
                System.out.println("👍 不错！两个相同！获得" + winAmount + "金币！");
            } else {
                System.out.println("😢 没有中奖，再试一次！");
            }

            coins += winAmount;

            if (coins <= 0) {
                System.out.println("金币用完了！");
                break;
            }
        }

        System.out.println("\n游戏结束！最终金币: " + coins);
    }

    // 6. 迷宫生成（简单版）
    private static void mazeGenerator(Random random) {
        System.out.println("\n=== 迷宫生成 ===");
        int width = 10;
        int height = 10;
        char[][] maze = new char[height][width];

        // 初始化迷宫
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                maze[i][j] = '█';  // 墙壁
            }
        }

        // 使用随机深度优先搜索生成迷宫
        generateMazeDFS(maze, 1, 1, width, height, random);

        // 设置入口和出口
        maze[0][1] = 'S';  // 入口
        maze[height-1][width-2] = 'E';  // 出口

        // 打印迷宫
        System.out.println("生成的迷宫（S=起点，E=终点，█=墙，空格=路）:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void generateMazeDFS(char[][] maze, int x, int y, int width, int height, Random random) {
        maze[y][x] = ' ';  // 挖开当前位置

        // 四个方向
        int[][] directions = {{0, 2}, {2, 0}, {0, -2}, {-2, 0}};

        // 随机打乱方向
        for (int i = 0; i < 4; i++) {
            int swapIndex = random.nextInt(4);
            int[] temp = directions[i];
            directions[i] = directions[swapIndex];
            directions[swapIndex] = temp;
        }

        // 递归探索
        for (int[] dir : directions) {
            int newX = x + dir[0];
            int newY = y + dir[1];
            int wallX = x + dir[0] / 2;
            int wallY = y + dir[1] / 2;

            if (newX > 0 && newX < width - 1 && newY > 0 && newY < height - 1 && maze[newY][newX] == '█') {
                maze[wallY][wallX] = ' ';  // 挖开墙壁
                generateMazeDFS(maze, newX, newY, width, height, random);
            }
        }
    }
}
