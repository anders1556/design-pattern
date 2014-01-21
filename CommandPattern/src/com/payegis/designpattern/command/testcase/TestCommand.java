package com.payegis.designpattern.command.testcase;

import com.payegis.designpattern.command.Command;
import com.payegis.designpattern.command.ConcreteCommand;
import com.payegis.designpattern.command.Invoker;
import com.payegis.designpattern.command.Receiver;

public class TestCommand
{
   public static void main(String[] args)
   {
      Receiver receiver = new Receiver();
      Command command = new ConcreteCommand(receiver);
      // �ͻ���ͨ����������ִ������
      Invoker invoker = new Invoker();
      invoker.setCommand(command);
      invoker.action();
   }
}
