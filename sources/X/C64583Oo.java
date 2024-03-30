package X;

/* renamed from: X.3Oo  reason: invalid class name and case insensitive filesystem */
public final class C64583Oo {
    public final AnonymousClass16E A00;
    public final C21010yW A01;
    public final AnonymousClass005 A02;

    public static final Integer A00(AnonymousClass3T1 r2) {
        int i;
        if (r2 instanceof AnonymousClass2bV) {
            i = 39;
        } else {
            int i2 = r2.A1I;
            if (i2 == 1) {
                return 2;
            }
            i = 3;
            if (i2 != 3) {
                if (i2 == 13) {
                    i = 11;
                } else if (i2 != 2) {
                    return null;
                } else {
                    i = 4;
                }
            }
        }
        return Integer.valueOf(i);
    }

    public C64583Oo(AnonymousClass16E r1, C21010yW r2, AnonymousClass005 r3) {
        C36321k7.A11(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0103 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Boolean r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.String r13, java.util.List r14, int r15, boolean r16) {
        /*
            r8 = this;
            java.util.ArrayList r3 = X.C36321k7.A0J(r14)
            java.util.Iterator r2 = r14.iterator()
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0042
            X.3T1 r0 = X.C36391kE.A0l(r2)
            java.lang.Integer r0 = A00(r0)
            if (r0 == 0) goto L_0x003f
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x0025
            java.lang.String r0 = "photo"
        L_0x0021:
            r3.add(r0)
            goto L_0x0008
        L_0x0025:
            r0 = 3
            if (r1 != r0) goto L_0x002b
            java.lang.String r0 = "video"
            goto L_0x0021
        L_0x002b:
            r0 = 4
            if (r1 != r0) goto L_0x0031
            java.lang.String r0 = "audio"
            goto L_0x0021
        L_0x0031:
            r0 = 11
            if (r1 != r0) goto L_0x0038
            java.lang.String r0 = "gif"
            goto L_0x0021
        L_0x0038:
            r0 = 39
            if (r1 != r0) goto L_0x003f
            java.lang.String r0 = "text"
            goto L_0x0021
        L_0x003f:
            java.lang.String r0 = "other"
            goto L_0x0021
        L_0x0042:
            r2 = 0
            java.lang.String r1 = ", "
            java.lang.String r0 = ""
            java.lang.String r2 = X.C007103b.A0Q(r1, r0, r0, r3, r2)
            X.005 r0 = r8.A02
            java.lang.Object r1 = r0.get()
            X.1UZ r1 = (X.AnonymousClass1UZ) r1
            java.lang.String r0 = "media_type"
            r1.A02(r2, r0)
            java.util.Iterator r7 = r14.iterator()
        L_0x005c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0183
            X.3T1 r3 = X.C36391kE.A0l(r7)
            r5 = 2
            boolean r6 = X.AnonymousClass000.A1S(r15, r5)
            X.2SM r2 = new X.2SM
            r2.<init>()
            java.lang.Integer r0 = A00(r3)
            r2.A03 = r0
            X.16E r0 = r8.A00
            int r4 = r0.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L_0x0180
            r1 = 3
            if (r4 == 0) goto L_0x008c
            r0 = 1
            r1 = 2
            if (r4 == r0) goto L_0x008c
            if (r4 != r5) goto L_0x0180
            r1 = 4
        L_0x008c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0090:
            r2.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            r2.A00 = r0
            X.3GP r0 = r3.A0c
            X.3XT r0 = r0.A01
            if (r0 == 0) goto L_0x00b6
            int r4 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L_0x017d
            r1 = 3
            if (r4 == 0) goto L_0x00b0
            r0 = 1
            r1 = 2
            if (r4 == r0) goto L_0x00b0
            if (r4 != r5) goto L_0x017d
            r1 = 4
        L_0x00b0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x00b4:
            r2.A05 = r0
        L_0x00b6:
            r2.A04 = r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r2.A06 = r0
            r2.A07 = r13
            X.3Qa r0 = r3.A1J
            java.lang.String r0 = r0.A01
            r2.A09 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.A01 = r0
            if (r11 == 0) goto L_0x0103
            int r4 = r11.intValue()
            r3 = 125(0x7d, float:1.75E-43)
            switch(r4) {
                case -25: goto L_0x010d;
                case -24: goto L_0x0110;
                case -23: goto L_0x0113;
                case -22: goto L_0x0116;
                case -21: goto L_0x0119;
                case -20: goto L_0x011c;
                case -19: goto L_0x011f;
                case -18: goto L_0x0130;
                case -17: goto L_0x0133;
                case -16: goto L_0x0136;
                case -15: goto L_0x0139;
                case -14: goto L_0x013c;
                case -13: goto L_0x00d7;
                case -12: goto L_0x013f;
                case -11: goto L_0x0142;
                case -10: goto L_0x0153;
                case -9: goto L_0x0156;
                case -8: goto L_0x0159;
                case -7: goto L_0x015c;
                case -6: goto L_0x015f;
                case -5: goto L_0x0162;
                case -4: goto L_0x00d7;
                case -3: goto L_0x0165;
                case -2: goto L_0x0168;
                case -1: goto L_0x016b;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unclassified error code: {"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "} subCode: {"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r3 = X.AnonymousClass000.A0t(r1, r3)
        L_0x00ef:
            if (r9 == 0) goto L_0x0101
            boolean r0 = r9.booleanValue()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = "previous_session_"
        L_0x00fd:
            java.lang.String r3 = X.AnonymousClass000.A0p(r0, r3, r1)
        L_0x0101:
            r2.A08 = r3
        L_0x0103:
            X.0yW r0 = r8.A01
            r0.Bly(r2)
            goto L_0x005c
        L_0x010a:
            java.lang.String r0 = "current_session_"
            goto L_0x00fd
        L_0x010d:
            java.lang.String r3 = "crosspost_empty_media_path"
            goto L_0x00ef
        L_0x0110:
            java.lang.String r3 = "crosspost_empty_unique_id"
            goto L_0x00ef
        L_0x0113:
            java.lang.String r3 = "crosspost_entry_not_found_in_session_data"
            goto L_0x00ef
        L_0x0116:
            java.lang.String r3 = "eligibility_empty_unique_id"
            goto L_0x00ef
        L_0x0119:
            java.lang.String r3 = "eligibility_invalid_text_media_path"
            goto L_0x00ef
        L_0x011c:
            java.lang.String r3 = "eligibility_invalid_non_text_direct_url"
            goto L_0x00ef
        L_0x011f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "eligibility_entry_state_invalid, actual state: {"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r3 = X.AnonymousClass000.A0t(r1, r3)
            goto L_0x00ef
        L_0x0130:
            java.lang.String r3 = "eligibility_entry_not_found_in_session_data"
            goto L_0x00ef
        L_0x0133:
            java.lang.String r3 = "eligibility_db_map_empty"
            goto L_0x00ef
        L_0x0136:
            java.lang.String r3 = "text_status_burning_failed"
            goto L_0x00ef
        L_0x0139:
            java.lang.String r3 = "eligibility_session_data_validation_failed"
            goto L_0x00ef
        L_0x013c:
            java.lang.String r3 = "eligibility_purpose_encryption_key_validation_failed"
            goto L_0x00ef
        L_0x013f:
            java.lang.String r3 = "media_upload_cached_db_map_empty"
            goto L_0x00ef
        L_0x0142:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "media_upload_result_error: {"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r3 = X.AnonymousClass000.A0t(r1, r3)
            goto L_0x00ef
        L_0x0153:
            java.lang.String r3 = "media_upload_empty_direct_url"
            goto L_0x00ef
        L_0x0156:
            java.lang.String r3 = "media_upload_media_file_not_exist"
            goto L_0x00ef
        L_0x0159:
            java.lang.String r3 = "media_upload_invalid_non_text_status_media_data"
            goto L_0x00ef
        L_0x015c:
            java.lang.String r3 = "media_upload_invalid_text_status_file_path"
            goto L_0x00ef
        L_0x015f:
            java.lang.String r3 = "media_upload_invalid_status_type"
            goto L_0x00ef
        L_0x0162:
            java.lang.String r3 = "account not linked"
            goto L_0x00ef
        L_0x0165:
            java.lang.String r3 = "crosspost_shared"
            goto L_0x00ef
        L_0x0168:
            java.lang.String r3 = "crosspost_already_sharing"
            goto L_0x00ef
        L_0x016b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "delivery_failure with subCode: {"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r3 = X.AnonymousClass000.A0t(r1, r3)
            goto L_0x00ef
        L_0x017d:
            r0 = 0
            goto L_0x00b4
        L_0x0180:
            r0 = 0
            goto L_0x0090
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64583Oo.A01(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, int, boolean):void");
    }
}
