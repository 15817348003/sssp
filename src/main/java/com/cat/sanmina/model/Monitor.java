package com.cat.sanmina.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spc_monitor")
public class Monitor implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "monitor_key")
    private Integer monitorKey;

    @Column(name = "monitor_initial_key")
    private Integer monitorInitialKey;


    @Column(name = "net_user_id",length = 50)
    private String netUserId;

    @Column(name = "monitor_name",length = 200)
    private String monitorName;

    @Column(name = "monitor_type",length = 10)
    private String monitorType;

    @Column(name = "monitor_short_name",length = 50)
    private String monitorShortName;

    @Column(name = "part_number",length = 50)
    private String partNumber;

    @Column(name = "grouping_type",length = 10)
    private String groupingType;

    @Column(name = "visible_chart",length = 50)
    private String visibleChart;

    @Column(name = "monitor_status",length = 10)
    private String monitorStatus;

    @Column(name = "attribute_name",length = 2000)
    private String attributeName;

    @Column(name = "grouping_time_range")
    private Integer groupingTimeRange;

    @Column(name = "last_group_date")
    private Date lastGroupDate;

    @Column(name = "part_family_key")
    private Integer partFamilyKey;

    @Column(name = "part_family_id",length = 50)
    private String partFamilyId;

    @Column(name = "part_family_name",length = 60)
    private String partFamilyName;

    @Column(name = "sample_size")
    private Integer sampleSize;

    @Column(name = "monitor_create_time")
    private Date monitorCreateTime;

    @Column(name = "extf1",length = 200)
    private String extf1;

    @Column(name = "extf2",length = 200)
    private String extf2;

    @Column(name = "extf3",length = 200)
    private String extf3;

    @Column(name = "data_source")
    private Integer dataSource;

    @Column(name = "last_group_time")
    private Integer lastGroupTime;

    @Column(name = "last_group_time2")
    private Integer lastGroupTime2;

    @Column(name = "last_group_time3")
    private Integer lastGroupTime3;

    @Column(name = "last_group_time4")
    private Integer lastGroupTime4;

    private static final long serialVersionUID = 1L;

    public Integer getMonitorKey() {
        return monitorKey;
    }

    public void setMonitorKey(Integer monitorKey) {
        this.monitorKey = monitorKey;
    }

    public Integer getMonitorInitialKey() {
        return monitorInitialKey;
    }

    public void setMonitorInitialKey(Integer monitorInitialKey) {
        this.monitorInitialKey = monitorInitialKey;
    }

    public String getNetUserId() {
        return netUserId;
    }

    public void setNetUserId(String netUserId) {
        this.netUserId = netUserId == null ? null : netUserId.trim();
    }

    public String getMonitorName() {
        return monitorName;
    }

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName == null ? null : monitorName.trim();
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType == null ? null : monitorType.trim();
    }

    public String getMonitorShortName() {
        return monitorShortName;
    }

    public void setMonitorShortName(String monitorShortName) {
        this.monitorShortName = monitorShortName == null ? null : monitorShortName.trim();
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber == null ? null : partNumber.trim();
    }

    public String getGroupingType() {
        return groupingType;
    }

    public void setGroupingType(String groupingType) {
        this.groupingType = groupingType == null ? null : groupingType.trim();
    }

    public String getVisibleChart() {
        return visibleChart;
    }

    public void setVisibleChart(String visibleChart) {
        this.visibleChart = visibleChart == null ? null : visibleChart.trim();
    }

    public String getMonitorStatus() {
        return monitorStatus;
    }

    public void setMonitorStatus(String monitorStatus) {
        this.monitorStatus = monitorStatus == null ? null : monitorStatus.trim();
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }

    public Integer getGroupingTimeRange() {
        return groupingTimeRange;
    }

    public void setGroupingTimeRange(Integer groupingTimeRange) {
        this.groupingTimeRange = groupingTimeRange;
    }

    public Date getLastGroupDate() {
        return lastGroupDate;
    }

    public void setLastGroupDate(Date lastGroupDate) {
        this.lastGroupDate = lastGroupDate;
    }

    public Integer getPartFamilyKey() {
        return partFamilyKey;
    }

    public void setPartFamilyKey(Integer partFamilyKey) {
        this.partFamilyKey = partFamilyKey;
    }

    public String getPartFamilyId() {
        return partFamilyId;
    }

    public void setPartFamilyId(String partFamilyId) {
        this.partFamilyId = partFamilyId == null ? null : partFamilyId.trim();
    }

    public String getPartFamilyName() {
        return partFamilyName;
    }

    public void setPartFamilyName(String partFamilyName) {
        this.partFamilyName = partFamilyName == null ? null : partFamilyName.trim();
    }

    public Integer getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(Integer sampleSize) {
        this.sampleSize = sampleSize;
    }

    public Date getMonitorCreateTime() {
        return monitorCreateTime;
    }

    public void setMonitorCreateTime(Date monitorCreateTime) {
        this.monitorCreateTime = monitorCreateTime;
    }

    public String getExtf1() {
        return extf1;
    }

    public void setExtf1(String extf1) {
        this.extf1 = extf1 == null ? null : extf1.trim();
    }

    public String getExtf2() {
        return extf2;
    }

    public void setExtf2(String extf2) {
        this.extf2 = extf2 == null ? null : extf2.trim();
    }

    public String getExtf3() {
        return extf3;
    }

    public void setExtf3(String extf3) {
        this.extf3 = extf3 == null ? null : extf3.trim();
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public Integer getLastGroupTime() {
        return lastGroupTime;
    }

    public void setLastGroupTime(Integer lastGroupTime) {
        this.lastGroupTime = lastGroupTime;
    }

    public Integer getLastGroupTime2() {
        return lastGroupTime2;
    }

    public void setLastGroupTime2(Integer lastGroupTime2) {
        this.lastGroupTime2 = lastGroupTime2;
    }

    public Integer getLastGroupTime3() {
        return lastGroupTime3;
    }

    public void setLastGroupTime3(Integer lastGroupTime3) {
        this.lastGroupTime3 = lastGroupTime3;
    }

    public Integer getLastGroupTime4() {
        return lastGroupTime4;
    }

    public void setLastGroupTime4(Integer lastGroupTime4) {
        this.lastGroupTime4 = lastGroupTime4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", monitorKey=").append(monitorKey);
        sb.append(", monitorInitialKey=").append(monitorInitialKey);
        sb.append(", netUserId=").append(netUserId);
        sb.append(", monitorName=").append(monitorName);
        sb.append(", monitorType=").append(monitorType);
        sb.append(", monitorShortName=").append(monitorShortName);
        sb.append(", partNumber=").append(partNumber);
        sb.append(", groupingType=").append(groupingType);
        sb.append(", visibleChart=").append(visibleChart);
        sb.append(", monitorStatus=").append(monitorStatus);
        sb.append(", attributeName=").append(attributeName);
        sb.append(", groupingTimeRange=").append(groupingTimeRange);
        sb.append(", lastGroupDate=").append(lastGroupDate);
        sb.append(", partFamilyKey=").append(partFamilyKey);
        sb.append(", partFamilyId=").append(partFamilyId);
        sb.append(", partFamilyName=").append(partFamilyName);
        sb.append(", sampleSize=").append(sampleSize);
        sb.append(", monitorCreateTime=").append(monitorCreateTime);
        sb.append(", extf1=").append(extf1);
        sb.append(", extf2=").append(extf2);
        sb.append(", extf3=").append(extf3);
        sb.append(", dataSource=").append(dataSource);
        sb.append(", lastGroupTime=").append(lastGroupTime);
        sb.append(", lastGroupTime2=").append(lastGroupTime2);
        sb.append(", lastGroupTime3=").append(lastGroupTime3);
        sb.append(", lastGroupTime4=").append(lastGroupTime4);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}