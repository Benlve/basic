package com.ben._03_socket._03_review;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP网络编程，复习
 * 无需连接，以数据报的形式发送
 * <p>
 * 说明：发送的目的地，封装在数据报里面，和数据一起
 *
 * @Author 廖新平
 * @Date 2022/12/23 21:55
 */
public class ReviewUDP {

    //发送端
    @Test
    public void sender() {
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket();
            byte[] data = "UDP方式：来自发送端的数据".getBytes();
            DatagramPacket datagramPacket = new DatagramPacket
                    (data, 0, data.length, InetAddress.getByName("127.0.0.1"), 8897);
            datagramSocket.send(datagramPacket);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }


    }

    //接收端
    @Test
    public void receiver() {

        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket(8897);
            byte[] buffer = new byte[100];
            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
            datagramSocket.receive(datagramPacket);

            String s = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }
    }
}
