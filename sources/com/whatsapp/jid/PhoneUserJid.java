package com.whatsapp.jid;

import X.AnonymousClass00C;
import X.C19740wR;
import X.C222913s;
import X.C223013t;
import android.os.Parcel;
import android.os.Parcelable;

public final class PhoneUserJid extends UserJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C223013t();
    public static final C222913s Companion = new C222913s();
    public static final UserJid WHATSAPP_CAPS_SURVEY = C222913s.A00("16505361212");
    public final String userString;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneUserJid(String str) {
        super(str);
        AnonymousClass00C.A0D(str, 1);
        this.userString = str;
        if (!C222913s.A01(this.user)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid user: ");
            sb.append(this.user);
            throw new C19740wR(sb.toString());
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.userString);
    }
}
