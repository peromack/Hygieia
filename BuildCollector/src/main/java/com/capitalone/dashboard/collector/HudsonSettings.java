package com.capitalone.dashboard.collector;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Bean to hold settings specific to the Hudson collector.
 */
@Component
@ConfigurationProperties(prefix = "jenkins")
public class HudsonSettings {
    

    private String cron;
    private boolean saveLog = false;
    private List<String> servers;

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public boolean isSaveLog() {
        return saveLog;
    }

    public void setSaveLog(boolean saveLog) {
        this.saveLog = saveLog;
    }

    public List<String> getServers() {
        return servers;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }
}
