package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass11F;
import X.AnonymousClass144;
import X.AnonymousClass17X;
import X.AnonymousClass189;
import X.AnonymousClass1FN;
import X.AnonymousClass64Y;
import X.AnonymousClass6H4;
import X.AnonymousClass6X6;
import X.AnonymousClass7i8;
import X.C133256Xm;
import X.C165617ti;
import X.C177538dx;
import X.C18740tg;
import X.C18800tq;
import X.C18840tu;
import X.C19730wQ;
import X.C20810yC;
import X.C220412q;
import X.C222713q;
import X.C232617u;
import X.C25151Fe;
import X.C36441kJ;
import X.C90464aC;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.whispersystems.jobqueue.requirements.Requirement;

public class AxolotlMultiDeviceSessionRequirement implements Requirement, AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient Object A00 = C36441kJ.A11();
    public transient AnonymousClass189 A01;
    public transient C25151Fe A02;
    public transient AnonymousClass1FN A03;
    public transient AnonymousClass11F A04;
    public transient AnonymousClass64Y A05;
    public transient AnonymousClass005 A06;
    public transient int A07;
    public transient List A08;
    public transient boolean A09;
    public volatile transient int A0A;
    @Deprecated
    public boolean forceSenderKeyDistribution;
    public Boolean messageFromMe;
    public final String messageKeyId;
    public int messageType;
    public final String remoteRawJid;
    public final HashSet targetDeviceRawJids;

    public static List A00(AxolotlMultiDeviceSessionRequirement axolotlMultiDeviceSessionRequirement) {
        HashSet hashSet;
        List list;
        String A0D;
        synchronized (axolotlMultiDeviceSessionRequirement.A00) {
            if (axolotlMultiDeviceSessionRequirement instanceof AxolotlMultiDeviceSenderKeyRequirement) {
                AxolotlMultiDeviceSenderKeyRequirement axolotlMultiDeviceSenderKeyRequirement = (AxolotlMultiDeviceSenderKeyRequirement) axolotlMultiDeviceSessionRequirement;
                HashSet hashSet2 = axolotlMultiDeviceSenderKeyRequirement.A05.A03;
                if (hashSet2 == null || hashSet2.isEmpty()) {
                    AnonymousClass1FN r4 = axolotlMultiDeviceSenderKeyRequirement.A03;
                    AnonymousClass11F r2 = axolotlMultiDeviceSenderKeyRequirement.A04;
                    Boolean bool = axolotlMultiDeviceSenderKeyRequirement.messageFromMe;
                    C18740tg.A06(bool);
                    HashSet A002 = r4.A00(C165617ti.A0R(r2, axolotlMultiDeviceSenderKeyRequirement.messageKeyId, bool.booleanValue()));
                    AnonymousClass11F r1 = axolotlMultiDeviceSenderKeyRequirement.A04;
                    C222713q r0 = AnonymousClass11F.A00;
                    AnonymousClass144 A003 = AnonymousClass6H4.A00(r1);
                    C18740tg.A06(A003);
                    int i = axolotlMultiDeviceSenderKeyRequirement.messageType;
                    C20810yC r8 = axolotlMultiDeviceSenderKeyRequirement.A04;
                    C19730wQ r5 = axolotlMultiDeviceSenderKeyRequirement.A00;
                    C220412q r22 = axolotlMultiDeviceSenderKeyRequirement.A01;
                    C232617u r12 = axolotlMultiDeviceSenderKeyRequirement.A02;
                    if (r8.A0E(3069) && r22.A0O(A003)) {
                        if (i == 15 || i == 68) {
                            AnonymousClass6X6 A092 = r12.A09(A003);
                            if (A092 != null && (!A092.A0P(r5))) {
                                hashSet = A002;
                            }
                        }
                    }
                    boolean z = axolotlMultiDeviceSenderKeyRequirement.useParticipantUserHash;
                    AnonymousClass17X r02 = axolotlMultiDeviceSenderKeyRequirement.A03;
                    boolean z2 = axolotlMultiDeviceSenderKeyRequirement.useLidForEncryption;
                    if (z) {
                        A0D = r02.A04(A003, z2);
                    } else {
                        AnonymousClass6X6 A0C = r02.A07.A0C(A003);
                        if (z2) {
                            A0D = A0C.A0B();
                        } else {
                            A0D = A0C.A0D();
                        }
                    }
                    hashSet = A002;
                    if (!(!A0D.equals(axolotlMultiDeviceSenderKeyRequirement.groupParticipantHash))) {
                        HashSet A0I = axolotlMultiDeviceSenderKeyRequirement.A03.A07.A0C(A003).A0I(axolotlMultiDeviceSenderKeyRequirement.A00, axolotlMultiDeviceSenderKeyRequirement.useLidForEncryption);
                        A0I.retainAll(A002);
                        if (A003 instanceof C177538dx) {
                            HashSet A16 = C36441kJ.A16();
                            Iterator it = A002.iterator();
                            while (it.hasNext()) {
                                DeviceJid deviceJid = (DeviceJid) it.next();
                                if (axolotlMultiDeviceSenderKeyRequirement.A00.A0N(deviceJid)) {
                                    A16.add(deviceJid);
                                }
                            }
                            A0I.addAll(A16);
                        }
                        hashSet = A0I;
                    }
                } else {
                    hashSet = axolotlMultiDeviceSenderKeyRequirement.A05.A00();
                }
            } else {
                hashSet = axolotlMultiDeviceSessionRequirement.A05.A00();
            }
            if (!axolotlMultiDeviceSessionRequirement.A09 || axolotlMultiDeviceSessionRequirement.A07 != hashSet.size()) {
                if (!hashSet.isEmpty()) {
                    ArrayList A052 = C133256Xm.A05(hashSet);
                    axolotlMultiDeviceSessionRequirement.A08 = AnonymousClass001.A0I();
                    int size = A052.size() / 100;
                    int size2 = A052.size() % 100;
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = i2 * 100;
                        i2++;
                        axolotlMultiDeviceSessionRequirement.A08.add(A052.subList(i3, i2 * 100));
                    }
                    if (size2 > 0) {
                        axolotlMultiDeviceSessionRequirement.A08.add(A052.subList(A052.size() - size2, A052.size()));
                    }
                } else {
                    axolotlMultiDeviceSessionRequirement.A08 = null;
                }
                axolotlMultiDeviceSessionRequirement.A09 = true;
                axolotlMultiDeviceSessionRequirement.A07 = hashSet.size();
                axolotlMultiDeviceSessionRequirement.A0A = 0;
            }
            list = axolotlMultiDeviceSessionRequirement.A08;
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (r7 != r2) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BMk() {
        /*
            r20 = this;
            r4 = r20
            java.util.List r3 = A00(r4)
            r18 = 1
            if (r3 == 0) goto L_0x00dc
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00dc
            int r0 = r4.A0A
            r19 = r0
        L_0x0014:
            X.189 r9 = r4.A01
            int r0 = r4.A0A
            java.lang.Object r2 = r3.get(r0)
            java.util.List r2 = (java.util.List) r2
            java.util.HashSet r17 = X.C36441kJ.A16()
            X.18a r8 = r9.A0G
            monitor-enter(r8)
            java.util.HashSet r0 = r8.A01(r2)     // Catch:{ all -> 0x00d9 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x00d9 }
            r0 = 0
            if (r1 == 0) goto L_0x00aa
            java.util.HashSet r12 = r8.A02(r2)     // Catch:{ all -> 0x00d9 }
            int r7 = r12.size()     // Catch:{ all -> 0x00d9 }
            r0 = 1
            if (r7 == 0) goto L_0x00aa
            X.18e r0 = r9.A0B     // Catch:{ all -> 0x00d9 }
            android.database.Cursor r11 = r0.A01(r12)     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = "record"
            int r16 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "recipient_id"
            int r10 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "recipient_type"
            int r6 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "device_id"
            int r5 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x00cf }
            r2 = 0
        L_0x005a:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x008f
            r0 = r16
            byte[] r14 = r11.getBlob(r0)     // Catch:{ all -> 0x00cf }
            long r0 = r11.getLong(r10)     // Catch:{ all -> 0x00cf }
            java.lang.String r15 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00cf }
            int r13 = r11.getInt(r6)     // Catch:{ all -> 0x00cf }
            int r0 = r11.getInt(r5)     // Catch:{ all -> 0x00cf }
            X.6EZ r1 = new X.6EZ     // Catch:{ all -> 0x00cf }
            r1.<init>(r15, r13, r0)     // Catch:{ all -> 0x00cf }
            X.9eC r0 = new X.9eC     // Catch:{ IOException -> 0x0089 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x0089 }
            X.AnonymousClass189.A02(r0)     // Catch:{ IOException -> 0x0089 }
            r8.A03(r0, r1)     // Catch:{ IOException -> 0x0089 }
            int r2 = r2 + 1
            goto L_0x005a
        L_0x0089:
            r0 = r17
            r0.add(r1)     // Catch:{ all -> 0x00cf }
            goto L_0x005a
        L_0x008f:
            r11.close()     // Catch:{ all -> 0x00d9 }
            r8.A04(r12)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r8)     // Catch:{ all -> 0x00d9 }
            java.util.Iterator r1 = r17.iterator()
        L_0x009a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r1.next()
            X.6EZ r0 = (X.AnonymousClass6EZ) r0
            r9.A0E(r0)
            goto L_0x009a
        L_0x00aa:
            monitor-exit(r8)     // Catch:{ all -> 0x00d9 }
            goto L_0x00b6
        L_0x00ac:
            int r0 = r17.size()
            if (r0 != 0) goto L_0x00b5
            r0 = 1
            if (r7 == r2) goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            r2 = 0
            if (r0 != 0) goto L_0x00ba
            return r2
        L_0x00ba:
            int r0 = r4.A0A
            int r1 = r0 + 1
            r4.A0A = r1
            int r0 = r3.size()
            if (r1 != r0) goto L_0x00c8
            r4.A0A = r2
        L_0x00c8:
            int r1 = r4.A0A
            r0 = r19
            if (r1 != r0) goto L_0x0014
            return r18
        L_0x00cf:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x00d4 }
            goto L_0x00d8
        L_0x00d4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00d9 }
        L_0x00d8:
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00d9 }
            throw r0
        L_0x00dc:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.BMk():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r4.booleanValue() != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AxolotlMultiDeviceSessionRequirement(X.AnonymousClass11F r3, java.lang.Boolean r4, java.lang.String r5, java.util.Set r6, int r7) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = X.C36441kJ.A11()
            r2.A00 = r0
            r2.messageKeyId = r5
            if (r4 == 0) goto L_0x0014
            boolean r1 = r4.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.messageFromMe = r0
            r2.A04 = r3
            java.lang.String r0 = r3.getRawString()
            r2.remoteRawJid = r0
            java.util.HashSet r0 = X.C36441kJ.A16()
            X.AnonymousClass143.A0C(r6, r0)
            r2.targetDeviceRawJids = r0
            r2.messageType = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.<init>(X.11F, java.lang.Boolean, java.lang.String, java.util.Set, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r1 != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readObject(java.io.ObjectInputStream r3) {
        /*
            r2 = this;
            r3.defaultReadObject()
            java.lang.String r1 = r2.remoteRawJid     // Catch:{ 0wR -> 0x002e }
            X.13q r0 = X.AnonymousClass11F.A00     // Catch:{ 0wR -> 0x002e }
            X.11F r0 = X.C222713q.A01(r1)     // Catch:{ 0wR -> 0x002e }
            r2.A04 = r0     // Catch:{ 0wR -> 0x002e }
            java.lang.Object r0 = X.C36441kJ.A11()
            r2.A00 = r0
            java.lang.Boolean r0 = r2.messageFromMe
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.messageFromMe = r0
            boolean r0 = r2.forceSenderKeyDistribution
            if (r0 == 0) goto L_0x002d
            r0 = 58
            r2.messageType = r0
        L_0x002d:
            return
        L_0x002e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "invalid jid="
            r1.append(r0)
            java.lang.String r0 = r2.remoteRawJid
            java.io.InvalidObjectException r0 = X.C90464aC.A0N(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.readObject(java.io.ObjectInputStream):void");
    }

    public void Bqf(Context context) {
        C18800tq A0I = C90464aC.A0I(context);
        this.A01 = A0I.AzT();
        this.A06 = C18840tu.A00(A0I.A0y);
        this.A03 = (AnonymousClass1FN) A0I.A7D.get();
        C25151Fe r2 = (C25151Fe) A0I.A51.get();
        this.A02 = r2;
        AnonymousClass005 r6 = this.A06;
        AnonymousClass1FN r3 = this.A03;
        AnonymousClass11F r4 = this.A04;
        Boolean bool = this.messageFromMe;
        C18740tg.A06(bool);
        this.A05 = new AnonymousClass64Y(r2, r3, r4, C165617ti.A0R(r4, this.messageKeyId, bool.booleanValue()), r6, this.targetDeviceRawJids, this.messageType);
    }
}
