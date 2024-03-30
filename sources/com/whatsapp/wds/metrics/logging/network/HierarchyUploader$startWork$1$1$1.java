package com.whatsapp.wds.metrics.logging.network;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0UQ;
import X.AnonymousClass19R;
import X.AnonymousClass720;
import X.C009003v;
import X.C023509x;
import X.C104525Aa;
import X.C122925ve;
import X.C130856Mr;
import X.C36441kJ;
import X.C97324ov;
import X.C97344ox;
import com.whatsapp.graphql.GraphqlRequest$postAwait$2;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.wds.metrics.logging.network.HierarchyUploader$startWork$1$1$1", f = "HierarchyUploader.kt", i = {0}, l = {47}, m = "invokeSuspend", n = {"logFiles"}, s = {"L$0"})
public final class HierarchyUploader$startWork$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass0UQ $completer;
    public Object L$0;
    public int label;
    public final /* synthetic */ C122925ve this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HierarchyUploader$startWork$1$1$1(AnonymousClass0UQ r2, C122925ve r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$completer = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new HierarchyUploader$startWork$1$1$1(this.$completer, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0UQ r1;
        Object obj2;
        File[] fileArr;
        boolean z;
        File[] fileArr2;
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            File A0w = C36441kJ.A0w(this.this$0.A01.A00.getCacheDir(), "wds_metrics");
            if (!A0w.exists() || (fileArr2 = A0w.listFiles(new AnonymousClass720())) == null) {
                fileArr2 = new File[0];
            }
            long currentTimeMillis = System.currentTimeMillis() - C130856Mr.A03;
            for (File file : fileArr2) {
                if (file.lastModified() < currentTimeMillis) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            File A0w2 = C36441kJ.A0w(this.this$0.A01.A00.getCacheDir(), "wds_metrics");
            if (!A0w2.exists() || (fileArr = A0w2.listFiles(new AnonymousClass720())) == null) {
                fileArr = new File[0];
            }
            if (!AnonymousClass000.A1Q(fileArr.length)) {
                C104525Aa r12 = (C104525Aa) this.this$0.A02.get();
                AnonymousClass00C.A0B(r12);
                this.L$0 = fileArr;
                this.label = 1;
                if (GraphqlRequest$postAwait$2.A01(r12, this, AnonymousClass19R.A01) == r3) {
                    return r3;
                }
            }
            r1 = this.$completer;
            obj2 = C97344ox.A00();
            r1.A00(obj2);
            return AnonymousClass0AJ.A00;
        } else if (i == 1) {
            fileArr = (File[]) this.L$0;
            try {
                AnonymousClass0AN.A00(obj);
            } catch (Exception | OutOfMemoryError unused2) {
                z = false;
            }
        } else {
            throw AnonymousClass000.A0e();
        }
        z = true;
        if (z) {
            for (File file2 : fileArr) {
                if (file2 != null) {
                    try {
                        file2.delete();
                    } catch (Exception unused3) {
                    }
                }
            }
            r1 = this.$completer;
            obj2 = C97344ox.A00();
            r1.A00(obj2);
            return AnonymousClass0AJ.A00;
        }
        r1 = this.$completer;
        obj2 = C97324ov.A00();
        r1.A00(obj2);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((HierarchyUploader$startWork$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
