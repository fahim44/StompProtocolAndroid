package ua.naiksoftware.stomp;

import org.greenrobot.eventbus.EventBus;

public class SocketAction {

    private String className;

    public SocketAction(String className){
        this.className = className;
    }

    public String getClassName(){
        return className;
    }

    public void call() {
        EventBus.getDefault().post(this);
    }
}