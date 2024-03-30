package com.whatsapp.expressionstray.emoji.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1H2;
import X.AnonymousClass1XQ;
import X.AnonymousClass38I;
import X.AnonymousClass3TY;
import X.AnonymousClass3UO;
import X.AnonymousClass5TR;
import X.AnonymousClass6CK;
import X.AnonymousClass6JA;
import X.C009003v;
import X.C023509x;
import X.C1033755c;
import X.C1034255h;
import X.C1034355i;
import X.C1270066o;
import X.C130496Lh;
import X.C90464aC;
import X.C90524aI;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.data.EmojiExpressionsDataSource$getEmojiItems$2", f = "EmojiExpressionsDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsDataSource$getEmojiItems$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Integer $qplInstanceKey;
    public int label;
    public final /* synthetic */ C130496Lh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsDataSource$getEmojiItems$2(C130496Lh r2, Integer num, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$qplInstanceKey = num;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EmojiExpressionsDataSource$getEmojiItems$2(this.this$0, this.$qplInstanceKey, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C130496Lh r0;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C1270066o r1 = this.this$0.A03;
            int andIncrement = r1.A02.getAndIncrement();
            r1.A01.markerStart(694884634, andIncrement);
            this.this$0.A03.A00(andIncrement, "emoji_fetching_start", (String) null);
            int i = 0;
            boolean A1R = AnonymousClass000.A1R(this.this$0.A00.A02());
            this.this$0.A03.A00(andIncrement, "load_emoji_pages_start", (String) null);
            AnonymousClass6JA.A00(this.this$0.A04);
            int i2 = true + (A1R ? 1 : 0);
            this.this$0.A03.A00(andIncrement, "load_emoji_pages_end", (String) null);
            ArrayList A0I = AnonymousClass001.A0I();
            ArrayList A0I2 = AnonymousClass001.A0I();
            if (A1R) {
                this.this$0.A03.A00(andIncrement, "load_recent_emojis_start", (String) null);
                AnonymousClass6CK r10 = new AnonymousClass6CK(R.drawable.selector_emoji_recent, R.string.f12nameremoved, "recents", true);
                A0I.add(r10);
                A0I2.add(new C1034255h(r10, "recents", R.string.f12nameremoved));
                int A02 = this.this$0.A00.A02();
                while (true) {
                    r0 = this.this$0;
                    if (i >= A02) {
                        break;
                    }
                    int[] iArr = (int[]) r0.A00.A03(i);
                    AnonymousClass1H2 r12 = this.this$0.A01;
                    AnonymousClass00C.A0B(iArr);
                    AnonymousClass1H2 r17 = r12;
                    A0I2.add(new C1034355i(r17, r10, (Integer) null, iArr, iArr));
                    i++;
                }
                r0.A03.A00(andIncrement, "load_recent_emojis_end", String.valueOf(A0I2.size()));
            }
            for (int i3 = A1R; i3 < i2; i3++) {
                C1270066o r2 = this.this$0.A03;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("load_emoji_section_");
                A0u.append(i3);
                r2.A00(andIncrement, AnonymousClass000.A0q("_start", A0u), (String) null);
                AnonymousClass38I r11 = AnonymousClass6JA.A00(this.this$0.A04)[i3 - A1R];
                String A0r = AnonymousClass000.A0r("page_", AnonymousClass000.A0u(), i3);
                Object obj2 = this.this$0.A06.get(C90524aI.A0a(r11.A00));
                AnonymousClass00C.A0B(obj2);
                int A0I3 = AnonymousClass000.A0I(obj2);
                int i4 = r11.A02;
                AnonymousClass6CK r122 = new AnonymousClass6CK(A0I3, i4, A0r, false);
                A0I.add(r122);
                A0I2.add(new C1034255h(r122, AnonymousClass000.A0r("page_", AnonymousClass000.A0u(), i3), i4));
                List<AnonymousClass1XQ> list = (List) r11.A03.get();
                AnonymousClass00C.A08(list);
                C130496Lh r112 = this.this$0;
                for (AnonymousClass1XQ r02 : list) {
                    int[] iArr2 = r02.A00;
                    int[] iArr3 = iArr2;
                    if (AnonymousClass3UO.A02(iArr2)) {
                        iArr3 = AnonymousClass3TY.A04(r112.A05, iArr2);
                    } else if (AnonymousClass3UO.A03(iArr2)) {
                        iArr3 = AnonymousClass3TY.A05(r112.A05, iArr2);
                    } else {
                        A0I2.add(new C1034355i(r112.A01, r122, (Integer) null, iArr2, iArr3));
                    }
                    AnonymousClass00C.A08(iArr3);
                    A0I2.add(new C1034355i(r112.A01, r122, (Integer) null, iArr2, iArr3));
                }
                this.this$0.A03.A00(andIncrement, AnonymousClass000.A0q("_end", C90464aC.A0h(i3, "load_emoji_section_")), (String) null);
            }
            C1033755c r3 = new C1033755c(this.$qplInstanceKey, A0I, A0I2);
            C130496Lh r22 = this.this$0;
            r22.A03.A00(andIncrement, "emoji_fetching_end", (String) null);
            r22.A03.A01(AnonymousClass5TR.SUCCESS, andIncrement);
            return r3;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiExpressionsDataSource$getEmojiItems$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
