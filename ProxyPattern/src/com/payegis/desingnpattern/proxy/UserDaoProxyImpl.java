package com.payegis.desingnpattern.proxy;

/**
 * @author SongChao.
 * 代理对象
 */
public class UserDaoProxyImpl implements IUserDao
{
   public IUserDao userDao;
   
   public UserDaoProxyImpl(IUserDao dao)
   {
      this.userDao = dao;
   }

   @Override
   public void addUser()
   {
      //TODO:添加控制
      userDao.addUser();
   }

   @Override
   public void delUser()
   {
      //TODO:添加控制
      userDao.delUser();
   }

}
