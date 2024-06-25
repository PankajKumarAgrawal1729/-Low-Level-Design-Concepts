package BehavioralDesignPattern.ChainResponsibilityDesignPattern;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nexLogProcessor;

    LogProcessor(LogProcessor logProcessor){
        this.nexLogProcessor = logProcessor;
    }

    public void log(int level, String msg){
        if(nexLogProcessor != null){
            nexLogProcessor.log(level, msg);
        }
    }
}
