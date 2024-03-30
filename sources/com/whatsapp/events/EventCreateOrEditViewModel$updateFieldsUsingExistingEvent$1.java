package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass05L;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass2bT;
import X.AnonymousClass3IM;
import X.AnonymousClass3J7;
import X.AnonymousClass3Q2;
import X.AnonymousClass3QB;
import X.C009003v;
import X.C023509x;
import X.C40071us;
import X.C51232nU;
import X.C51852oU;
import com.whatsapp.location.PlaceInfo;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1", f = "EventCreateOrEditViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C40071us this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1(C40071us r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        AnonymousClass3QB r0;
        Object value2;
        C51852oU r4;
        String str;
        C51232nU r1;
        AnonymousClass3IM r42;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C40071us r02 = this.this$0;
            AnonymousClass2bT r3 = (AnonymousClass2bT) r02.A0B.A03(r02.A0A);
            if (r3 != null) {
                PlaceInfo placeInfo = null;
                String str2 = null;
                if (this.this$0.A07.A02(r3) != null) {
                    placeInfo = new PlaceInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0d, 0.0d, 0.0d, 0);
                    AnonymousClass3J7 r12 = r3.A01;
                    String str3 = null;
                    if (r12 != null) {
                        str2 = r12.A02;
                    }
                    placeInfo.A06 = str2;
                    if (r12 != null) {
                        str3 = r12.A01;
                    }
                    placeInfo.A04 = str3;
                    if (!(r12 == null || (r42 = r12.A00) == null)) {
                        placeInfo.A01 = r42.A00;
                        placeInfo.A02 = r42.A01;
                    }
                }
                AnonymousClass05L r6 = this.this$0.A0E;
                do {
                    value = r6.getValue();
                    r0 = (AnonymousClass3QB) value;
                } while (!r6.B3B(value, new AnonymousClass3QB(r3, r0.A00, r0.A02, placeInfo)));
                String str4 = r3.A04;
                if (!(str4 == null || str4.length() == 0 || !this.this$0.A06.A0F(str4))) {
                    C40071us r7 = this.this$0;
                    AnonymousClass05L r62 = r7.A0D;
                    do {
                        value2 = r62.getValue();
                        r4 = C51852oU.SUCCESS;
                        str = r3.A04;
                        if (r7.A06.A0I(str)) {
                            r1 = C51232nU.WA_VIDEO_CALL;
                        } else {
                            r1 = C51232nU.WA_VOICE_CALL;
                        }
                    } while (!r62.B3B(value2, new AnonymousClass3Q2(r4, r1, str)));
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
