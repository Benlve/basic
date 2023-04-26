package com.ben._03_socket._01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 网络节点
 *
 * @Author 廖新平
 * @Date 2022/12/20 23:04
 * <p>
 * <p>
 * 1.IP：标识互联网中唯一的计算机（通信实体）
 * 2.Java中使用InetAddress类代表IP
 * 3.IP地址分类
 * （1）IPv4 和 IPv6
 * （2）王伟王 和 局域网
 * <p>
 * <p>
 * 4.域名：
 * http://14.215.177.39/ --> https://www.baidu.com/
 * http://42.121.6.2/ --> http://www.atguigu.com/
 * <p>
 * 5.本地回路地址：127.0.0.1 --> localhost
 */
public class Test1InetAddress {
    public static void main(String[] args) {

        //TODO 1.获取IP
        InetAddress inet1 = null;
        InetAddress inet2 = null;
        try {
            inet1 = InetAddress.getByName("14.215.177.39");
            inet2 = InetAddress.getByName("www.atguigu.com");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(inet1.getHostName());  //百度IP（局域网）
        System.out.println(inet2.getHostAddress());  //尚硅谷IP（局域网）

        System.out.println("\n********************\n");

        //TODO 2.获取本机InetAddress对象
        InetAddress localHost = null;
        InetAddress inet3 = null;
        try {
            localHost = InetAddress.getLocalHost();
            inet3 = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(localHost); //本机IP 局域网显示的IP
        System.out.println(inet3);  //本机IP 本地回路显示的IP

        System.out.println("\n********************\n");

        //TODO 3.获取主机域名和主机地址
        String hostName = inet2.getHostName();
        String hostAddress = inet2.getHostAddress();
        System.out.println(hostName);
        System.out.println(hostAddress);

    }
}
