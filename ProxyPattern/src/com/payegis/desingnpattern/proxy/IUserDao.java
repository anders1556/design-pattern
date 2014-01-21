package com.payegis.desingnpattern.proxy;

/**
 * @author SongChao
 * 数据库操作接口，代理对象和被代理对象都需要实现这个接口
 */
public interface IUserDao
{
   public void addUser();
   
   public void delUser();
}
