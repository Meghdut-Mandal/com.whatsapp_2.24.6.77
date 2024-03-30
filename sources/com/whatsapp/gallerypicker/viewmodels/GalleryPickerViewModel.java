package com.whatsapp.gallerypicker.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass1A2;
import X.AnonymousClass6N7;
import X.C001700s;
import X.C005502l;
import X.C007403e;
import X.C18820ts;
import X.C19630wG;
import X.C19970wo;
import X.C20810yC;
import X.C21060yb;
import X.C235718z;
import X.C36321k7;
import X.C36431kI;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class GalleryPickerViewModel extends AnonymousClass04R {
    public C007403e A00;
    public final C001700s A01 = C36431kI.A0S();
    public final C19970wo A02;
    public final AnonymousClass6N7 A03;
    public final C005502l A04;
    public final C005502l A05;
    public final C235718z A06;
    public final C21060yb A07;
    public final C19630wG A08;
    public final C18820ts A09;
    public final C20810yC A0A;
    public final AnonymousClass1A2 A0B;

    public final class BucketsCollector {
        public int A00;
        public long A01 = SystemClock.uptimeMillis();
        public final List A02 = AnonymousClass001.A0I();
        public final int A03;

        public BucketsCollector(int i) {
            this.A03 = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
            if (X.AnonymousClass0A2.A00(r8, r4.A05, new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2(r4, r3, (X.C023509x) null)) == r7) goto L_0x005f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A00(X.C62613Gv r12, X.C023509x r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof X.AnonymousClass7AK
                if (r0 == 0) goto L_0x0091
                r8 = r13
                X.7AK r8 = (X.AnonymousClass7AK) r8
                int r2 = r8.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L_0x0091
                int r2 = r2 - r1
                r8.label = r2
            L_0x0012:
                java.lang.Object r1 = r8.result
                X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
                int r0 = r8.label
                r10 = 2
                r2 = 1
                if (r0 == 0) goto L_0x003e
                if (r0 == r2) goto L_0x0036
                if (r0 != r10) goto L_0x0098
                java.lang.Object r2 = r8.L$0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r2 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r2
                X.AnonymousClass0AN.A00(r1)
            L_0x0027:
                long r0 = android.os.SystemClock.uptimeMillis()
                r2.A01 = r0
            L_0x002d:
                int r0 = r2.A00
                int r0 = r0 + 1
                r2.A00 = r0
                X.0AJ r0 = X.AnonymousClass0AJ.A00
                return r0
            L_0x0036:
                java.lang.Object r2 = r8.L$0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r2 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r2
                X.AnonymousClass0AN.A00(r1)
                goto L_0x002d
            L_0x003e:
                X.AnonymousClass0AN.A00(r1)
                int r1 = r11.A00
                int r0 = r11.A03
                if (r1 >= r0) goto L_0x0060
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r4 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.this
                java.util.List r3 = X.C36371kC.A11(r12)
                r8.L$0 = r11
                r8.label = r2
                X.02l r2 = r4.A05
                r1 = 0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2 r0 = new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2
                r0.<init>(r4, r3, r1)
                java.lang.Object r0 = X.AnonymousClass0A2.A00(r8, r2, r0)
                if (r0 != r7) goto L_0x008f
            L_0x005f:
                return r7
            L_0x0060:
                java.util.List r9 = r11.A02
                r9.add(r12)
                long r5 = r11.A01
                r0 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 + r0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r4 = com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.this
                long r1 = android.os.SystemClock.uptimeMillis()
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x008f
                java.util.ArrayList r3 = X.C36441kJ.A15(r9)
                r9.clear()
                r8.L$0 = r11
                r8.label = r10
                X.02l r2 = r4.A05
                r1 = 0
                com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2 r0 = new com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$notifyFolderAdded$2
                r0.<init>(r4, r3, r1)
                java.lang.Object r0 = X.AnonymousClass0A2.A00(r8, r2, r0)
                if (r0 == r7) goto L_0x005f
                r2 = r11
                goto L_0x0027
            L_0x008f:
                r2 = r11
                goto L_0x002d
            L_0x0091:
                X.7AK r8 = new X.7AK
                r8.<init>(r11, r13)
                goto L_0x0012
            L_0x0098:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector.A00(X.3Gv, X.09x):java.lang.Object");
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9 A[EDGE_INSN: B:30:0x00b9->B:25:0x00b9 ?: BREAK  , SYNTHETIC] */
    public static final java.lang.Object A01(android.database.Cursor r16, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r17, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r18, X.C023509x r19, int r20) {
        /*
            r7 = r19
            r3 = r18
            r5 = r16
            r4 = r17
            r12 = r20
            boolean r0 = r7 instanceof X.AnonymousClass7B5
            if (r0 == 0) goto L_0x00bc
            r2 = r7
            X.7B5 r2 = (X.AnonymousClass7B5) r2
            int r6 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r1
            if (r0 == 0) goto L_0x00bc
            int r6 = r6 - r1
            r2.label = r6
        L_0x001c:
            java.lang.Object r6 = r2.result
            X.0AO r1 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r2.label
            r9 = 1
            if (r0 == 0) goto L_0x00b4
            if (r0 != r9) goto L_0x00c3
            int r12 = r2.I$0
            java.lang.Object r15 = r2.L$3
            X.3mI r15 = (X.C74863mI) r15
            java.lang.Object r4 = r2.L$2
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r4 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r4
            java.lang.Object r5 = r2.L$1
            android.database.Cursor r5 = (android.database.Cursor) r5
            java.lang.Object r3 = r2.L$0
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r3 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r3
            X.AnonymousClass0AN.A00(r6)
        L_0x003c:
            r15.close()
            r9 = 1
        L_0x0040:
            boolean r0 = r5.moveToNext()
            if (r0 == 0) goto L_0x00b9
            X.13o r6 = com.whatsapp.jid.Jid.Companion
            r8 = 0
            java.lang.String r0 = r5.getString(r8)
            com.whatsapp.jid.Jid r7 = r6.A02(r0)
            java.lang.String r10 = r5.getString(r9)
            boolean r0 = r7 instanceof X.AnonymousClass11F
            if (r0 == 0) goto L_0x0069
            X.18z r0 = r3.A06
            r6 = r7
            X.11F r6 = (X.AnonymousClass11F) r6
            X.AnonymousClass00C.A0D(r6, r8)
            X.12q r0 = r0.A06
            boolean r0 = r0.A0Q(r6)
            if (r0 != 0) goto L_0x0040
        L_0x0069:
            java.lang.String r9 = X.AnonymousClass143.A03(r7)
            X.0yC r7 = r3.A0A
            X.0yb r6 = r3.A07
            X.1A2 r0 = r3.A0B
            X.2UH r15 = new X.2UH
            r19 = r9
            r20 = r12
            r16 = r6
            r17 = r7
            r18 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            int r0 = r15.getCount()
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            if (r0 != 0) goto L_0x003c
            if (r10 != 0) goto L_0x0090
            java.lang.String r10 = ""
        L_0x0090:
            X.4V2 r8 = r15.BDy(r8)
            int r13 = r15.getCount()
            r11 = 9
            r14 = 0
            X.3Gv r7 = new X.3Gv
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r2.L$0 = r3
            r2.L$1 = r5
            r2.L$2 = r4
            r2.L$3 = r15
            r2.I$0 = r12
            r0 = 1
            r2.label = r0
            java.lang.Object r0 = r4.A00(r7, r2)
            if (r0 != r1) goto L_0x003c
            return r1
        L_0x00b4:
            X.AnonymousClass0AN.A00(r6)
            if (r16 != 0) goto L_0x0040
        L_0x00b9:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00bc:
            X.7B5 r2 = new X.7B5
            r2.<init>(r3, r7)
            goto L_0x001c
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A01(android.database.Cursor, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, X.09x, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r12, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r13, X.C023509x r14) {
        /*
            boolean r0 = r14 instanceof X.AnonymousClass7AL
            if (r0 == 0) goto L_0x0066
            r3 = r14
            X.7AL r3 = (X.AnonymousClass7AL) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0066
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r4 = r3.result
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r3.label
            r11 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 != r11) goto L_0x006c
            java.lang.Object r1 = r3.L$0
            X.4Uo r1 = (X.C88924Uo) r1
            X.AnonymousClass0AN.A00(r4)
        L_0x0024:
            r1.close()
        L_0x0027:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x002a:
            X.AnonymousClass0AN.A00(r4)
            boolean r0 = X.C19550w8.A07()
            if (r0 == 0) goto L_0x0027
            X.6N7 r0 = r13.A03
            r9 = 7
            r6 = 0
            X.4Uo r1 = X.C36431kI.A0c(r0, r6, r9, r11)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0024
            r8 = 3
            X.0wG r0 = r13.A08
            android.content.Context r4 = r0.A00
            r0 = 2131886464(0x7f120180, float:1.9407508E38)
            java.lang.String r7 = X.C36361kB.A0m(r4, r0)
            r0 = 0
            X.4V2 r5 = r1.BDy(r0)
            int r10 = r1.getCount()
            X.3Gv r4 = new X.3Gv
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.L$0 = r1
            r3.label = r11
            java.lang.Object r0 = r12.A00(r4, r3)
            if (r0 != r2) goto L_0x0024
            return r2
        L_0x0066:
            X.7AL r3 = new X.7AL
            r3.<init>(r13, r14)
            goto L_0x0012
        L_0x006c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A02(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, X.09x):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bc, code lost:
        if (r11.intValue() == r12) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r17, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r18, X.C023509x r19, int r20) {
        /*
            r3 = r19
            r8 = r18
            r9 = r17
            r7 = r20
            boolean r0 = r3 instanceof X.AnonymousClass7BA
            if (r0 == 0) goto L_0x00d6
            r6 = r3
            X.7BA r6 = (X.AnonymousClass7BA) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d6
            int r2 = r2 - r1
            r6.label = r2
        L_0x001a:
            java.lang.Object r10 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r6.label
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L_0x00c3
            if (r1 != r0) goto L_0x00e0
            int r3 = r6.I$2
            int r2 = r6.I$1
            int r7 = r6.I$0
            java.lang.Object r1 = r6.L$3
            X.38L[] r1 = (X.AnonymousClass38L[]) r1
            java.lang.Object r0 = r6.L$2
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r9 = r6.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r9 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r9
            java.lang.Object r8 = r6.L$0
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r8 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r8
            X.AnonymousClass0AN.A00(r10)
        L_0x003f:
            int r2 = r2 + 1
        L_0x0041:
            if (r2 >= r3) goto L_0x00dd
            r13 = r1[r2]
            int r14 = r13.A00
            r11 = r14 & r7
            if (r11 == 0) goto L_0x003f
            java.lang.String r12 = r13.A03
            X.6N7 r10 = r8.A03
            X.4Uo r10 = X.C36431kI.A0c(r10, r12, r11, r4)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00be
            java.lang.String r11 = X.C64143Mu.A00()
            boolean r11 = X.AnonymousClass00C.A0J(r11, r12)
            if (r11 == 0) goto L_0x00aa
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            int r11 = r10.getCount()
            X.C36421kH.A1M(r12, r0, r11)
        L_0x006e:
            int r11 = r13.A02
            java.lang.String r15 = r13.A03
            X.0wG r12 = r8.A08
            android.content.Context r14 = r12.A00
            int r12 = r13.A01
            java.lang.String r16 = X.C36361kB.A0m(r14, r12)
            X.4V2 r14 = r10.BDy(r4)
            int r19 = r10.getCount()
            X.3Gv r13 = new X.3Gv
            r20 = 0
            r18 = r7
            r17 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r10.close()
            r6.L$0 = r8
            r6.L$1 = r9
            r6.L$2 = r0
            r6.L$3 = r1
            r6.I$0 = r7
            r6.I$1 = r2
            r6.I$2 = r3
            r10 = 1
            r6.label = r10
            java.lang.Object r10 = r9.A00(r13, r6)
            if (r10 != r5) goto L_0x003f
            return r5
        L_0x00aa:
            if (r12 != 0) goto L_0x006e
            java.lang.Object r11 = X.C36371kC.A0r(r0, r14)
            java.lang.Number r11 = (java.lang.Number) r11
            int r12 = r10.getCount()
            if (r11 == 0) goto L_0x006e
            int r11 = r11.intValue()
            if (r11 != r12) goto L_0x006e
        L_0x00be:
            r10.close()
            goto L_0x003f
        L_0x00c3:
            X.AnonymousClass0AN.A00(r10)
            r0 = 7
            if (r7 != r0) goto L_0x00d3
            X.38L[] r1 = X.C64143Mu.A01
        L_0x00cb:
            java.util.HashMap r0 = X.AnonymousClass001.A0J()
            int r3 = r1.length
            r2 = 0
            goto L_0x0041
        L_0x00d3:
            X.38L[] r1 = X.C64143Mu.A00
            goto L_0x00cb
        L_0x00d6:
            X.7BA r6 = new X.7BA
            r6.<init>(r8, r3)
            goto L_0x001a
        L_0x00dd:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A03(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, X.09x, int):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c6 A[SYNTHETIC] */
    public static final java.lang.Object A04(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r13, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r14, X.C023509x r15, int r16) {
        /*
            r10 = r16
            boolean r0 = r15 instanceof X.AnonymousClass7B4
            if (r0 == 0) goto L_0x00bf
            r3 = r15
            X.7B4 r3 = (X.AnonymousClass7B4) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bf
            int r2 = r2 - r1
            r3.label = r2
        L_0x0014:
            java.lang.Object r5 = r3.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r3.label
            r7 = 1
            if (r0 == 0) goto L_0x0087
            if (r0 != r7) goto L_0x00c9
            int r10 = r3.I$0
            java.lang.Object r2 = r3.L$3
            X.4Uo r2 = (X.C88924Uo) r2
            java.lang.Object r1 = r3.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r13 = r3.L$1
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector r13 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector) r13
            java.lang.Object r14 = r3.L$0
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r14 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r14
            X.AnonymousClass0AN.A00(r5)
        L_0x0034:
            r2.close()
        L_0x0037:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r1)
            java.lang.Object r7 = r0.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.getValue()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r0 = X.C64143Mu.A00()
            boolean r0 = X.AnonymousClass00C.A0J(r7, r0)
            if (r0 != 0) goto L_0x0037
            X.6N7 r0 = r14.A03
            r12 = 0
            X.4Uo r2 = X.C36431kI.A0c(r0, r7, r10, r12)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0034
            X.4V2 r6 = r2.BDy(r12)
            int r11 = r2.getCount()
            r9 = 8
            X.3Gv r5 = new X.3Gv
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3.L$0 = r14
            r3.L$1 = r13
            r3.L$2 = r1
            r3.L$3 = r2
            r3.I$0 = r10
            r0 = 1
            r3.label = r0
            java.lang.Object r0 = r13.A00(r5, r3)
            if (r0 != r4) goto L_0x0034
            return r4
        L_0x0087:
            X.AnonymousClass0AN.A00(r5)
            X.6N7 r2 = r14.A03
            r1 = 0
            r0 = 0
            X.4Uo r6 = X.C36431kI.A0c(r2, r1, r10, r0)
            java.util.HashMap r0 = r6.B90()
            java.util.Set r0 = r0.entrySet()
            java.util.ArrayList r5 = X.C36441kJ.A15(r0)
            X.0ts r0 = r14.A09
            java.text.Collator r0 = X.C36361kB.A0p(r0)
            r0.setDecomposition(r7)
            X.4NS r2 = new X.4NS
            r2.<init>(r0)
            r1 = 15
            X.7qw r0 = new X.7qw
            r0.<init>(r2, r1)
            X.AnonymousClass03X.A08(r5, r0)
            r6.close()
            java.util.Iterator r1 = r5.iterator()
            goto L_0x0037
        L_0x00bf:
            X.7B4 r3 = new X.7B4
            r3.<init>(r14, r15)
            goto L_0x0014
        L_0x00c6:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00c9:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A04(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, X.09x, int):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.BucketsCollector r11, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r12, X.C023509x r13, int r14) {
        /*
            boolean r0 = r13 instanceof X.AnonymousClass7AM
            if (r0 == 0) goto L_0x0023
            r4 = r13
            X.7AM r4 = (X.AnonymousClass7AM) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0023
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r7 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r2) goto L_0x0029
            java.lang.Object r7 = r4.L$0
            java.io.Closeable r7 = (java.io.Closeable) r7
            goto L_0x0063
        L_0x0023:
            X.7AM r4 = new X.7AM
            r4.<init>(r12, r13)
            goto L_0x0012
        L_0x0029:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x002e:
            X.AnonymousClass0AN.A00(r1)
            X.0yb r0 = r12.A07
            X.0ya r5 = r0.A0O()
            if (r5 == 0) goto L_0x0058
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "content://"
            r1.append(r0)
            java.lang.String r0 = "com.whatsapp"
            r1.append(r0)
            java.lang.String r0 = ".provider.media/buckets"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            android.net.Uri r6 = android.net.Uri.parse(r0)
            r9 = r7
            r10 = r7
            r8 = r7
            android.database.Cursor r7 = r5.A03(r6, r7, r8, r9, r10)
        L_0x0058:
            r4.L$0 = r7     // Catch:{ all -> 0x0070 }
            r4.label = r2     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = A01(r7, r11, r12, r4, r14)     // Catch:{ all -> 0x0070 }
            if (r0 != r3) goto L_0x0066
            return r3
        L_0x0063:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ all -> 0x006e }
        L_0x0066:
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x006e }
            if (r7 == 0) goto L_0x006d
            r7.close()
        L_0x006d:
            return r0
        L_0x006e:
            r1 = move-exception
            goto L_0x0071
        L_0x0070:
            r1 = move-exception
        L_0x0071:
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel.A05(com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel$BucketsCollector, com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel, X.09x, int):java.lang.Object");
    }

    public void A0R() {
        C007403e r1 = this.A00;
        if (r1 != null) {
            r1.B2S((CancellationException) null);
        }
    }

    public GalleryPickerViewModel(C235718z r2, C21060yb r3, C19970wo r4, C19630wG r5, C18820ts r6, C20810yC r7, AnonymousClass6N7 r8, AnonymousClass1A2 r9, C005502l r10, C005502l r11) {
        C36321k7.A11(r4, r7, r5);
        AnonymousClass00C.A0D(r6, 5);
        C36321k7.A1C(r3, r2, r9, r10, r11);
        this.A02 = r4;
        this.A0A = r7;
        this.A08 = r5;
        this.A03 = r8;
        this.A09 = r6;
        this.A07 = r3;
        this.A06 = r2;
        this.A0B = r9;
        this.A04 = r10;
        this.A05 = r11;
    }
}
