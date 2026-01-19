package com.newzhxu.hammer.out.bandwagone.result;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Root {
    @JsonProperty("vm_type")
    private String vmType;
    @JsonProperty("ve_status")
    private String veStatus;
    @JsonProperty("ve_mac1")
    private String veMac1;
    @JsonProperty("ve_used_disk_space_b")
    private Long veUsedDiskSpaceB;
    @JsonProperty("ve_disk_quota_gb")
    private String veDiskQuotaGb;
    @JsonProperty("is_cpu_throttled")
    private String isCpuThrottled;
    @JsonProperty("is_disk_throttled")
    private String isDiskThrottled;
    @JsonProperty("ssh_port")
    private Long sshPort;
    @JsonProperty("live_hostname")
    private String liveHostname;
    @JsonProperty("load_average")
    private String loadAverage;
    @JsonProperty("mem_available_kb")
    private Long memAvailableKb;
    @JsonProperty("swap_total_kb")
    private Long swapTotalKb;
    @JsonProperty("swap_available_kb")
    private Long swapAvailableKb;
    @JsonProperty("screendump_png_base64")
    private String screendumpPngBase64;
    private String hostname;
    @JsonProperty("node_alias")
    private String nodeAlias;
    @JsonProperty("node_location_id")
    private String nodeLocationId;
    @JsonProperty("node_location")
    private String nodeLocation;
    @JsonProperty("node_datacenter")
    private String nodeDatacenter;
    @JsonProperty("location_ipv6_ready")
    private Boolean locationIpv6Ready;
    private String plan;
    @JsonProperty("plan_monthly_data")
    private Long planMonthlyData;
    @JsonProperty("monthly_data_multiplier")
    private Long monthlyDataMultiplier;
    @JsonProperty("plan_disk")
    private Long planDisk;
    @JsonProperty("plan_ram")
    private Long planRam;
    @JsonProperty("plan_swap")
    private Long planSwap;
    @JsonProperty("plan_max_ipv6s")
    private Long planMaxIpv6s;
    private String os;
    private String email;
    @JsonProperty("data_counter")
    private Long dataCounter;
    @JsonProperty("data_next_reset")
    private Long dataNextReset;
    @JsonProperty("ip_addresses")
    private List<String> ipAddresses;
    @JsonProperty("ipv6_sit_tunnel_endpoint")
    private String ipv6SitTunnelEndpoint;
    @JsonProperty("private_ip_addresses")
    private List<?> privateIpAddresses;
    @JsonProperty("ip_nullroutes")
    private List<?> ipNullroutes;
    private String iso1;
    private String iso2;
    @JsonProperty("available_isos")
    private List<String> availableIsos;
    @JsonProperty("plan_private_network_available")
    private Boolean planPrivateNetworkAvailable;
    @JsonProperty("location_private_network_available")
    private Boolean locationPrivateNetworkAvailable;
    @JsonProperty("rdns_api_available")
    private Boolean rdnsApiAvailable;
    private Ptr ptr;
    private Boolean suspended;
    @JsonProperty("policy_violation")
    private Boolean policyViolation;
    @JsonProperty("suspension_count")
    private Long suspensionCount;
    @JsonProperty("total_abuse_points")
    private Long totalAbusePoints;
    @JsonProperty("max_abuse_points")
    private Long maxAbusePoints;
    @JsonProperty("plan_kiwivm_theme")
    private String planKiwivmTheme;
    @JsonProperty("free_ip_replacement_interval")
    private Long freeIpReplacementInterval;
    private Long error;
    private Long veid;

    public Root(String vmType, String veStatus, String veMac1, Long veUsedDiskSpaceB, String veDiskQuotaGb, String isCpuThrottled, String isDiskThrottled, Long sshPort, String liveHostname, String loadAverage, Long memAvailableKb, Long swapTotalKb, Long swapAvailableKb, String screendumpPngBase64, String hostname, String nodeAlias, String nodeLocationId, String nodeLocation, String nodeDatacenter, Boolean locationIpv6Ready, String plan, Long planMonthlyData, Long monthlyDataMultiplier, Long planDisk, Long planRam, Long planSwap, Long planMaxIpv6s, String os, String email, Long dataCounter, Long dataNextReset, List<String> ipAddresses, String ipv6SitTunnelEndpoint, List<?> privateIpAddresses, List<?> ipNullroutes, String iso1, String iso2, List<String> availableIsos, Boolean planPrivateNetworkAvailable, Boolean locationPrivateNetworkAvailable, Boolean rdnsApiAvailable, Ptr ptr, Boolean suspended, Boolean policyViolation, Long suspensionCount, Long totalAbusePoints, Long maxAbusePoints, String planKiwivmTheme, Long freeIpReplacementInterval, Long error, Long veid) {
        this.vmType = vmType;
        this.veStatus = veStatus;
        this.veMac1 = veMac1;
        this.veUsedDiskSpaceB = veUsedDiskSpaceB;
        this.veDiskQuotaGb = veDiskQuotaGb;
        this.isCpuThrottled = isCpuThrottled;
        this.isDiskThrottled = isDiskThrottled;
        this.sshPort = sshPort;
        this.liveHostname = liveHostname;
        this.loadAverage = loadAverage;
        this.memAvailableKb = memAvailableKb;
        this.swapTotalKb = swapTotalKb;
        this.swapAvailableKb = swapAvailableKb;
        this.screendumpPngBase64 = screendumpPngBase64;
        this.hostname = hostname;
        this.nodeAlias = nodeAlias;
        this.nodeLocationId = nodeLocationId;
        this.nodeLocation = nodeLocation;
        this.nodeDatacenter = nodeDatacenter;
        this.locationIpv6Ready = locationIpv6Ready;
        this.plan = plan;
        this.planMonthlyData = planMonthlyData;
        this.monthlyDataMultiplier = monthlyDataMultiplier;
        this.planDisk = planDisk;
        this.planRam = planRam;
        this.planSwap = planSwap;
        this.planMaxIpv6s = planMaxIpv6s;
        this.os = os;
        this.email = email;
        this.dataCounter = dataCounter;
        this.dataNextReset = dataNextReset;
        this.ipAddresses = ipAddresses;
        this.ipv6SitTunnelEndpoint = ipv6SitTunnelEndpoint;
        this.privateIpAddresses = privateIpAddresses;
        this.ipNullroutes = ipNullroutes;
        this.iso1 = iso1;
        this.iso2 = iso2;
        this.availableIsos = availableIsos;
        this.planPrivateNetworkAvailable = planPrivateNetworkAvailable;
        this.locationPrivateNetworkAvailable = locationPrivateNetworkAvailable;
        this.rdnsApiAvailable = rdnsApiAvailable;
        this.ptr = ptr;
        this.suspended = suspended;
        this.policyViolation = policyViolation;
        this.suspensionCount = suspensionCount;
        this.totalAbusePoints = totalAbusePoints;
        this.maxAbusePoints = maxAbusePoints;
        this.planKiwivmTheme = planKiwivmTheme;
        this.freeIpReplacementInterval = freeIpReplacementInterval;
        this.error = error;
        this.veid = veid;
    }

    public String getVmType() {
        return this.vmType;
    }

    public String getVeStatus() {
        return this.veStatus;
    }

    public String getVeMac1() {
        return this.veMac1;
    }

    public Long getVeUsedDiskSpaceB() {
        return this.veUsedDiskSpaceB;
    }

    public String getVeDiskQuotaGb() {
        return this.veDiskQuotaGb;
    }

    public String getIsCpuThrottled() {
        return this.isCpuThrottled;
    }

    public String getIsDiskThrottled() {
        return this.isDiskThrottled;
    }

    public Long getSshPort() {
        return this.sshPort;
    }

    public String getLiveHostname() {
        return this.liveHostname;
    }

    public String getLoadAverage() {
        return this.loadAverage;
    }

    public Long getMemAvailableKb() {
        return this.memAvailableKb;
    }

    public Long getSwapTotalKb() {
        return this.swapTotalKb;
    }

    public Long getSwapAvailableKb() {
        return this.swapAvailableKb;
    }

    public String getScreendumpPngBase64() {
        return this.screendumpPngBase64;
    }

    public String getHostname() {
        return this.hostname;
    }

    public String getNodeAlias() {
        return this.nodeAlias;
    }

    public String getNodeLocationId() {
        return this.nodeLocationId;
    }

    public String getNodeLocation() {
        return this.nodeLocation;
    }

    public String getNodeDatacenter() {
        return this.nodeDatacenter;
    }

    public Boolean getLocationIpv6Ready() {
        return this.locationIpv6Ready;
    }

    public String getPlan() {
        return this.plan;
    }

    public Long getPlanMonthlyData() {
        return this.planMonthlyData;
    }

    public Long getMonthlyDataMultiplier() {
        return this.monthlyDataMultiplier;
    }

    public Long getPlanDisk() {
        return this.planDisk;
    }

    public Long getPlanRam() {
        return this.planRam;
    }

    public Long getPlanSwap() {
        return this.planSwap;
    }

    public Long getPlanMaxIpv6s() {
        return this.planMaxIpv6s;
    }

    public String getOs() {
        return this.os;
    }

    public String getEmail() {
        return this.email;
    }

    public Long getDataCounter() {
        return this.dataCounter;
    }

    public Long getDataNextReset() {
        return this.dataNextReset;
    }

    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    public String getIpv6SitTunnelEndpoint() {
        return this.ipv6SitTunnelEndpoint;
    }

    public List<?> getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }

    public List<?> getIpNullroutes() {
        return this.ipNullroutes;
    }

    public String getIso1() {
        return this.iso1;
    }

    public String getIso2() {
        return this.iso2;
    }

    public List<String> getAvailableIsos() {
        return this.availableIsos;
    }

    public Boolean getPlanPrivateNetworkAvailable() {
        return this.planPrivateNetworkAvailable;
    }

    public Boolean getLocationPrivateNetworkAvailable() {
        return this.locationPrivateNetworkAvailable;
    }

    public Boolean getRdnsApiAvailable() {
        return this.rdnsApiAvailable;
    }

    public Ptr getPtr() {
        return this.ptr;
    }

    public Boolean getSuspended() {
        return this.suspended;
    }

    public Boolean getPolicyViolation() {
        return this.policyViolation;
    }

    public Long getSuspensionCount() {
        return this.suspensionCount;
    }

    public Long getTotalAbusePoints() {
        return this.totalAbusePoints;
    }

    public Long getMaxAbusePoints() {
        return this.maxAbusePoints;
    }

    public String getPlanKiwivmTheme() {
        return this.planKiwivmTheme;
    }

    public Long getFreeIpReplacementInterval() {
        return this.freeIpReplacementInterval;
    }

    public Long getError() {
        return this.error;
    }

    public Long getVeid() {
        return this.veid;
    }

    public void setVmType(String vmType) {
        this.vmType = vmType;
    }

    public void setVeStatus(String veStatus) {
        this.veStatus = veStatus;
    }

    public void setVeMac1(String veMac1) {
        this.veMac1 = veMac1;
    }

    public void setVeUsedDiskSpaceB(Long veUsedDiskSpaceB) {
        this.veUsedDiskSpaceB = veUsedDiskSpaceB;
    }

    public void setVeDiskQuotaGb(String veDiskQuotaGb) {
        this.veDiskQuotaGb = veDiskQuotaGb;
    }

    public void setIsCpuThrottled(String isCpuThrottled) {
        this.isCpuThrottled = isCpuThrottled;
    }

    public void setIsDiskThrottled(String isDiskThrottled) {
        this.isDiskThrottled = isDiskThrottled;
    }

    public void setSshPort(Long sshPort) {
        this.sshPort = sshPort;
    }

    public void setLiveHostname(String liveHostname) {
        this.liveHostname = liveHostname;
    }

    public void setLoadAverage(String loadAverage) {
        this.loadAverage = loadAverage;
    }

    public void setMemAvailableKb(Long memAvailableKb) {
        this.memAvailableKb = memAvailableKb;
    }

    public void setSwapTotalKb(Long swapTotalKb) {
        this.swapTotalKb = swapTotalKb;
    }

    public void setSwapAvailableKb(Long swapAvailableKb) {
        this.swapAvailableKb = swapAvailableKb;
    }

    public void setScreendumpPngBase64(String screendumpPngBase64) {
        this.screendumpPngBase64 = screendumpPngBase64;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setNodeAlias(String nodeAlias) {
        this.nodeAlias = nodeAlias;
    }

    public void setNodeLocationId(String nodeLocationId) {
        this.nodeLocationId = nodeLocationId;
    }

    public void setNodeLocation(String nodeLocation) {
        this.nodeLocation = nodeLocation;
    }

    public void setNodeDatacenter(String nodeDatacenter) {
        this.nodeDatacenter = nodeDatacenter;
    }

    public void setLocationIpv6Ready(Boolean locationIpv6Ready) {
        this.locationIpv6Ready = locationIpv6Ready;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setPlanMonthlyData(Long planMonthlyData) {
        this.planMonthlyData = planMonthlyData;
    }

    public void setMonthlyDataMultiplier(Long monthlyDataMultiplier) {
        this.monthlyDataMultiplier = monthlyDataMultiplier;
    }

    public void setPlanDisk(Long planDisk) {
        this.planDisk = planDisk;
    }

    public void setPlanRam(Long planRam) {
        this.planRam = planRam;
    }

    public void setPlanSwap(Long planSwap) {
        this.planSwap = planSwap;
    }

    public void setPlanMaxIpv6s(Long planMaxIpv6s) {
        this.planMaxIpv6s = planMaxIpv6s;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataCounter(Long dataCounter) {
        this.dataCounter = dataCounter;
    }

    public void setDataNextReset(Long dataNextReset) {
        this.dataNextReset = dataNextReset;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public void setIpv6SitTunnelEndpoint(String ipv6SitTunnelEndpoint) {
        this.ipv6SitTunnelEndpoint = ipv6SitTunnelEndpoint;
    }

    public void setPrivateIpAddresses(List<?> privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
    }

    public void setIpNullroutes(List<?> ipNullroutes) {
        this.ipNullroutes = ipNullroutes;
    }

    public void setIso1(String iso1) {
        this.iso1 = iso1;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public void setAvailableIsos(List<String> availableIsos) {
        this.availableIsos = availableIsos;
    }

    public void setPlanPrivateNetworkAvailable(Boolean planPrivateNetworkAvailable) {
        this.planPrivateNetworkAvailable = planPrivateNetworkAvailable;
    }

    public void setLocationPrivateNetworkAvailable(Boolean locationPrivateNetworkAvailable) {
        this.locationPrivateNetworkAvailable = locationPrivateNetworkAvailable;
    }

    public void setRdnsApiAvailable(Boolean rdnsApiAvailable) {
        this.rdnsApiAvailable = rdnsApiAvailable;
    }

    public void setPtr(Ptr ptr) {
        this.ptr = ptr;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public void setPolicyViolation(Boolean policyViolation) {
        this.policyViolation = policyViolation;
    }

    public void setSuspensionCount(Long suspensionCount) {
        this.suspensionCount = suspensionCount;
    }

    public void setTotalAbusePoints(Long totalAbusePoints) {
        this.totalAbusePoints = totalAbusePoints;
    }

    public void setMaxAbusePoints(Long maxAbusePoints) {
        this.maxAbusePoints = maxAbusePoints;
    }

    public void setPlanKiwivmTheme(String planKiwivmTheme) {
        this.planKiwivmTheme = planKiwivmTheme;
    }

    public void setFreeIpReplacementInterval(Long freeIpReplacementInterval) {
        this.freeIpReplacementInterval = freeIpReplacementInterval;
    }

    public void setError(Long error) {
        this.error = error;
    }

    public void setVeid(Long veid) {
        this.veid = veid;
    }
}

class Ptr {
    @JsonProperty("80.251.208.194")
    private String n80251208194;
    @JsonProperty("2607:8700:5500:4298::")
    private String n2607870055004298;

    public Ptr(String n80251208194, String n2607870055004298) {
        this.n80251208194 = n80251208194;
        this.n2607870055004298 = n2607870055004298;
    }

    public String getN80251208194() {
        return this.n80251208194;
    }

    public String getN2607870055004298() {
        return this.n2607870055004298;
    }

    public void setN80251208194(String n80251208194) {
        this.n80251208194 = n80251208194;
    }

    public void setN2607870055004298(String n2607870055004298) {
        this.n2607870055004298 = n2607870055004298;
    }
}

