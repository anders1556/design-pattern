package com.payegis.desingnpattern.proxy.testcase;

import com.payegis.desingnpattern.proxy.IUserDao;
import com.payegis.desingnpattern.proxy.UserDaoMySqlImpl;
import com.payegis.desingnpattern.proxy.UserDaoProxyImpl;

public class TestProxy
{
   public static void main(String[] args)
   {
      // 被代理对象
      IUserDao daoOrignal = new UserDaoMySqlImpl();
      // 代理对象
      IUserDao daoProxy = new UserDaoProxyImpl(daoOrignal);
      // 使用代理类执行，被代理对象透明
      daoProxy.addUser();
      daoProxy.delUser();
   }

}
