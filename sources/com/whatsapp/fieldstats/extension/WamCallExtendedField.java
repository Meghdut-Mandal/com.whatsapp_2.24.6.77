package com.whatsapp.fieldstats.extension;

import X.AnonymousClass00C;
import X.C134166ab;
import android.os.Parcel;
import android.os.Parcelable;

public final class WamCallExtendedField implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134166ab();
    public final int fieldId;
    public final String fieldType;
    public final Object fieldValue;

    public WamCallExtendedField(int i, String str, Object obj) {
        AnonymousClass00C.A0D(str, 2);
        this.fieldId = i;
        this.fieldType = str;
        this.fieldValue = obj;
    }

    public static /* synthetic */ WamCallExtendedField copy$default(WamCallExtendedField wamCallExtendedField, int i, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = wamCallExtendedField.fieldId;
        }
        if ((i2 & 2) != 0) {
            str = wamCallExtendedField.fieldType;
        }
        if ((i2 & 4) != 0) {
            obj = wamCallExtendedField.fieldValue;
        }
        return wamCallExtendedField.copy(i, str, obj);
    }

    public final int component1() {
        return this.fieldId;
    }

    public final String component2() {
        return this.fieldType;
    }

    public final Object component3() {
        return this.fieldValue;
    }

    public final WamCallExtendedField copy(int i, String str, Object obj) {
        AnonymousClass00C.A0D(str, 1);
        return new WamCallExtendedField(i, str, obj);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WamCallExtendedField) {
                WamCallExtendedField wamCallExtendedField = (WamCallExtendedField) obj;
                if (this.fieldId != wamCallExtendedField.fieldId || !AnonymousClass00C.A0J(this.fieldType, wamCallExtendedField.fieldType) || !AnonymousClass00C.A0J(this.fieldValue, wamCallExtendedField.fieldValue)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = ((this.fieldId * 31) + this.fieldType.hashCode()) * 31;
        Object obj = this.fieldValue;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WamCallExtendedField(fieldId=");
        sb.append(this.fieldId);
        sb.append(", fieldType=");
        sb.append(this.fieldType);
        sb.append(", fieldValue=");
        sb.append(this.fieldValue);
        sb.append(')');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.fieldId);
        parcel.writeString(this.fieldType);
        parcel.writeValue(this.fieldValue);
    }
}
