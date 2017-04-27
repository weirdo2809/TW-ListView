package com.myapplicationdev.android.tw_listview;

/**
 * Created by 15041867 on 27/4/2017.
 */

public class Modules {
    private String moduleCode;
    private Boolean isProgramming;

    public Modules(String moduleCode, Boolean isProgramming) {
        this.moduleCode = moduleCode;
        this.isProgramming = isProgramming;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public Boolean getProgramming() {
        return isProgramming;
    }

    public void setProgramming(Boolean programming) {
        isProgramming = programming;
    }

    public boolean isProg() {
        return isProgramming;
    }
}
