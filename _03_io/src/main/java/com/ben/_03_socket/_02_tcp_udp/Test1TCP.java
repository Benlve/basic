package com.ben._03_socket._02_tcp_udp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 * 例子1：客户端发送信息给服务端，服务端将数据显示在控制台上
 *
 * @Author 廖新平
 * @Date 2022/12/21 22:08
 */
public class Test1TCP {

    //客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;

        try {
            System.out.println("start~");
            //一、客户端连接服务端两要素：IP 端口号 (网络中的节点)
            //1.IP
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");
            //2.port
            int serverPort = 8899;
            //建立套接字
            socket = new Socket(serverIP, serverPort);
            //二、IO流
            outputStream = socket.getOutputStream();
            //三、read and write
            outputStream.write("你好我来自客户端：\n信息~".getBytes());
            System.out.println("end~");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            //四、close
            if (outputStream != null) {
                try {
                    outputStream.close();
                    System.out.println("outputStream closed.");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println(e);
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("socket closed.");
                    System.out.println(e);
                }
            }
            System.out.println("null");
        }
    }

    //服务端
    @Test
    public void server() {

        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        try {
            int serverPort = 8899;

            serverSocket = new ServerSocket(serverPort);

            socket = serverSocket.accept();

            //输出客户端IP
            System.out.println(socket.getInetAddress().getHostAddress());
            System.out.println(socket.getInetAddress().getHostName());

            inputStream = socket.getInputStream();

            inputStreamReader = new InputStreamReader(inputStream);

            char[] cbuf = new char[10];
            int len;
            while ((len = inputStreamReader.read(cbuf)) != -1) {
                String s = new String(cbuf, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void Server2() {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            //1.指定端口号，创建socket接受来自客户端的数据
            int serverPort = 9008;
            serverSocket = new ServerSocket(serverPort);
            socket = serverSocket.accept();

            //2.获取输入流
            inputStream = socket.getInputStream();

            //3.读取来自客户端的数据，并显示在控制台
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[5];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                //将buffer的数据写出到ByteArrayOutputStream内部的字节数组
                byteArrayOutputStream.write(buffer, 0, len);
            }
            //显示
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
