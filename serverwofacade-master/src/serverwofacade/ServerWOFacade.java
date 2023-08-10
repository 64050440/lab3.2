/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;
public class ServerWOFacade {
    
private static ServerWOFacade ServerWOFacadeobj = null;
private ServerWOFacade(){}
public static ServerWOFacade getServerWOFacadeobject(){
if(ServerWOFacadeobj == null){
        ServerWOFacadeobj = new ServerWOFacade();
}
return ServerWOFacadeobj;
}
public void StartServer(){
        ScheduleServer scheduleServer = new ScheduleServer();
	scheduleServer.startBooting();
	scheduleServer.readSystemConfigFile();
	scheduleServer.init();
	scheduleServer.initializeContext();
	scheduleServer.initializeListeners();
	scheduleServer.createSystemObjects();
	System.out.println("Start working......");
	System.out.println("After work done.........");
	scheduleServer.releaseProcesses();
	scheduleServer.destory();
	scheduleServer.destroySystemObjects();
	scheduleServer.destoryListeners();
	scheduleServer.destoryContext();
	scheduleServer.shutdown();
}
   public static void main(String[] args) {
ServerWOFacade obj = ServerWOFacade.getServerWOFacadeobject();
obj.StartServer();
} 

    
}
