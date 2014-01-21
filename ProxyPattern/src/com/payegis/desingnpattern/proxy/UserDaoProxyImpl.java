package com.payegis.desingnpattern.proxy;

/**
 * @author SongChao.
 * �������
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
      //TODO:��ӿ���
      userDao.addUser();
   }

   @Override
   public void delUser()
   {
      //TODO:��ӿ���
      userDao.delUser();
   }

}
