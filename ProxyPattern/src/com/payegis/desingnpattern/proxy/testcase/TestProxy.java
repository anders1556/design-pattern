package com.payegis.desingnpattern.proxy.testcase;

import com.payegis.desingnpattern.proxy.IUserDao;
import com.payegis.desingnpattern.proxy.UserDaoMySqlImpl;
import com.payegis.desingnpattern.proxy.UserDaoProxyImpl;

public class TestProxy
{
   public static void main(String[] args)
   {
      // ���������
      IUserDao daoOrignal = new UserDaoMySqlImpl();
      // �������
      IUserDao daoProxy = new UserDaoProxyImpl(daoOrignal);
      // ʹ�ô�����ִ�У����������͸��
      daoProxy.addUser();
      daoProxy.delUser();
   }

}
