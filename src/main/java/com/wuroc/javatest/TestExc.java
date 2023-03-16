package com.wuroc.javatest;



import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/**
 * @ClassName TestExc
 * @Description leetcode 异常处理
 * @Author HepengWu
 * @Date 2021/6/26 14:41
 * @Version 1.0
 **/
public class TestExc {
    public static void main(String[] args) {
        //键盘输入
        /**
         * The "standard" input stream. This stream is already
         * open and ready to supply input data. Typically this stream
         * corresponds to keyboard input or another input source specified by
         * the host environment or user.
         * in Represents a reference to an inputstream
         */
        /**
         * “标准”输入流。 这个流已经
         * 打开并准备提供输入数据。 通常这个流
         * 对应于键盘输入或由指定的其他输入源
         * 主机环境或用户。
         */
        Scanner scanner = new Scanner(System.in);
        //输入第一个值
        String str1 = scanner.next();
        //输入第二个值,运算符
        String opStr = scanner.next();
        //第二个运算数
        String str2 = scanner.next();
        //关闭输入流
        scanner.close();

        System.out.println(calculate(str1, opStr, str2));


    }

    private static int calculate(@NotNull String str1, @NotNull String opStr, @NotNull String str2) {
        int result = 0;
        try {
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            //String 的charAt返回一个char类型
            char op = opStr.charAt(0);
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
            }
            return result;
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            //"block" 块
            System.out.println("The finally block");
        }
        return result;
    }
}
