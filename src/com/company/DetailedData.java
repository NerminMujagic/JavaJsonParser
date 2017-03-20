package com.company;

/**
 * Created by nermin on 18/03/2017.
 */
public class DetailedData {
    private String snowReportLastSnowCm;
    private String snowReportLastSnowDate;
    private int snowReportLiftsTotalNrOpen;
    private int snowReportSlopesTotalNrOpen;
    private String snowReportSlopeValleyOpen;
    private String snowReportResortOpen;
    private String resortName;
    private String snowResortId;
    private String snowReportSlopesCondition;
    private String snowReportDate;
    private Double snowReportSnowDepthBaseCm;
    private Double snowReportSnowDepthTopCm;


    @Override
    public String toString() {
        return "DetailedData:" +'\n' +
                " snowReportLastSnowCm= " + snowReportLastSnowCm + '\n' +
                " snowReportLastSnowDate= " + snowReportLastSnowDate + '\n' +
                " snowReportLiftsTotalNrOpen= " + snowReportLiftsTotalNrOpen +'\n' +
                " snowReportSlopesTotalNrOpen= " + snowReportSlopesTotalNrOpen +'\n' +
                " snowReportSlopeValleyOpen= " + snowReportSlopeValleyOpen + '\n' +
                " snowReportResortOpen= " + snowReportResortOpen + '\n' +
                " resortName= " + resortName + '\n' +
                " snowResortId= " + snowResortId + '\n' +
                " snowReportSlopesCondition= " + snowReportSlopesCondition + '\n' +
                " snowReportDate= " + snowReportDate + '\n' +
                " snowReportSnowDepthBaseCm= " + snowReportSnowDepthBaseCm +'\n' +
                " snowReportSnowDepthTopCm= " + snowReportSnowDepthTopCm +'\n';
    }

    public String getSnowReportLastSnowCm() {
        return snowReportLastSnowCm;
    }

    public void setSnowReportLastSnowCm(String snowReportLastSnowCm) {
        this.snowReportLastSnowCm = snowReportLastSnowCm;
    }

    public String getSnowReportLastSnowDate() {
        return snowReportLastSnowDate;
    }

    public void setSnowReportLastSnowDate(String snowReportLastSnowDate) {
        this.snowReportLastSnowDate = snowReportLastSnowDate;
    }

    public int getSnowReportLiftsTotalNrOpen() {
        return snowReportLiftsTotalNrOpen;
    }

    public void setSnowReportLiftsTotalNrOpen(int snowReportLiftsTotalNrOpen) {
        this.snowReportLiftsTotalNrOpen = snowReportLiftsTotalNrOpen;
    }

    public int getSnowReportSlopesTotalNrOpen() {
        return snowReportSlopesTotalNrOpen;
    }

    public void setSnowReportSlopesTotalNrOpen(int snowReportSlopesTotalNrOpen) {
        this.snowReportSlopesTotalNrOpen = snowReportSlopesTotalNrOpen;
    }

    public String getSnowReportSlopeValleyOpen() {
        return snowReportSlopeValleyOpen;
    }

    public void setSnowReportSlopeValleyOpen(String snowReportSlopeValleyOpen) {
        this.snowReportSlopeValleyOpen = snowReportSlopeValleyOpen;
    }

    public String getSnowReportResortOpen() {
        return snowReportResortOpen;
    }

    public void setSnowReportResortOpen(String snowReportResortOpen) {
        this.snowReportResortOpen = snowReportResortOpen;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public String getSnowResortId() {
        return snowResortId;
    }

    public void setSnowResortId(String snowResortId) {
        this.snowResortId = snowResortId;
    }

    public String getSnowReportSlopesCondition() {
        return snowReportSlopesCondition;
    }

    public void setSnowReportSlopesCondition(String snowReportSlopesCondition) {
        this.snowReportSlopesCondition = snowReportSlopesCondition;
    }

    public String getSnowReportDate() {
        return snowReportDate;
    }

    public void setSnowReportDate(String snowReportDate) {
        this.snowReportDate = snowReportDate;
    }

    public Double getSnowReportSnowDepthBaseCm() {
        return snowReportSnowDepthBaseCm;
    }

    public void setSnowReportSnowDepthBaseCm(Double snowReportSnowDepthBaseCm) {
        this.snowReportSnowDepthBaseCm = snowReportSnowDepthBaseCm;
    }

    public Double getSnowReportSnowDepthTopCm() {
        return snowReportSnowDepthTopCm;
    }

    public void setSnowReportSnowDepthTopCm(Double snowReportSnowDepthTopCm) {
        this.snowReportSnowDepthTopCm = snowReportSnowDepthTopCm;
    }

}
