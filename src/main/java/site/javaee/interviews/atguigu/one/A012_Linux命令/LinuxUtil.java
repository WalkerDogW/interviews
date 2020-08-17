package site.javaee.interviews.atguigu.one.A012_Linux命令;

/**
 * @author shkstart
 * @create 2020-08-17 0:37
 */
public class LinuxUtil {
/*
    Centos6
        服务：
            注册在系统中的标准化程序有统一的管理方式
                service 服务名 start/stop/restart/reload/status
            查看服务的方法
                /etc/init.d/服务名
            通过chkconfig命令设置自启动
                查看服务：chkconfig  --list|grep xxx
                设置自启动: chkconfig --legvel 5 服务名 on/off

        运行级别：

    Centos7
        服务：
            注册在系统中的标准化程序有统一的管理方式
                systemctl start/restart/stop/reload/status 服务名
            查看服务的方法
                /usr/lib/systemd/system
            查看服务的命令
                systemctl list-unit-files
                systemctl --type service
            通过systemctl 命令设置自启动
                systemctl enable/disable 服务名

 */

}
