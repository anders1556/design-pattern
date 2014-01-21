package com.payegis.desingnpattern.proxy;

/**
 * @author SongChao.
 * 被代理对象
 */
public class UserDaoMySqlImpl implements IUserDao
{

   @Override
   public void addUser()
   {
      System.out.println("UserDaoImpl----Mysql----addUser()");
   }

   @Override
   public void delUser()
   {
      System.out.println("UserDaoImpl----Mysql----delUser()");
   }

}
