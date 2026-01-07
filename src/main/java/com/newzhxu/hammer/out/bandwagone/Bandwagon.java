package com.newzhxu.hammer.out.bandwagone;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("https://api.64clouds.com/v1")
public interface Bandwagon {
    @GetExchange("/start")
    String start();

    @GetExchange("stop")
    String stop();

    @GetExchange("restart")
    String restart();

    @GetExchange("kill")
    String kill();

    @GetExchange("getServiceInfo")
    String getServiceInfo();

    @GetExchange("getLiveServiceInfo")
    String getLiveServiceInfo();

    @GetExchange("getAvailableOS")
    String getAvailableOS();

    @GetExchange("reinstallOS")
    String reinstallOS(@RequestParam String os);

    @GetExchange("updateSshKeys")
    String updateSshKeys(@RequestParam("ssh_keys") String sshKey);

    @GetExchange("getSshKeys")
    String getSshKeys();

    @GetExchange("resetRootPassword")
    String resetRootPassword();

    @GetExchange("getUsageGraphs")
    String getUsageGraphs();

    @GetExchange("getRawUsageStats")
    String getRawUsageStats();

    @GetExchange("getAuditLog")
    String getAuditLog();

    @GetExchange("setHostname")
    String setHostname(@RequestParam("newHostname") String hostname);

    @GetExchange("setPTR")
    String setPTR(@RequestParam("ip") String ip, @RequestParam("ptr") String ptr);

    @GetExchange("iso/mount")
    String isoMount(@RequestParam("iso") String iso);

    @GetExchange("iso/unmount")
    String isoUnmount();

    @GetExchange("basicShell/cd")
    String basicShellCd(@RequestParam("currentDir") String currentDir, @RequestParam("newDir") String newDir);

    @GetExchange("basicShell/exec")
    String basicShellExec(@RequestParam("command") String command);

    @GetExchange("shellScript/exec")
    String shellScriptExec(@RequestParam("script") String script);

    @GetExchange("snapshot/create")
    String snapshotCreate(@RequestParam(required = false) String description);

    @GetExchange("snapshot/list")
    String snapshotList();

    @GetExchange("snapshot/delete")
    String snapshotDelete(@RequestParam("snapshot") String snapshot);

    @GetExchange("snapshot/restore")
    String snapshotRestore(@RequestParam("snapshot") String snapshot);

    @GetExchange("snapshot/toggleSticky")
    String snapshotToggleSticky(@RequestParam("snapshot") String snapshot, @RequestParam String sticky);

    @GetExchange("snapshot/export")
    String snapshotExport(@RequestParam("snapshot") String snapshot);

}
