package com.whatsapp.voipcalling;

public class H26xSupportResult {
    public final boolean isH264HwSupported;
    public final boolean isH264SwSupported;
    public final boolean isH265HwSupported;
    public final boolean isH265SwSupported;

    public H26xSupportResult(boolean z, boolean z2, boolean z3, boolean z4) {
        this.isH264HwSupported = z;
        this.isH264SwSupported = z2;
        this.isH265HwSupported = z3;
        this.isH265SwSupported = z4;
    }
}
