package X;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.PrivateKey;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.applinks.AppLinkDeviceIdentityRequest;
import com.facebook.wearable.applinks.AppLinkLinkInfoRequest;
import com.facebook.wearable.applinks.AppLinkRegisterRequest;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.9oX  reason: invalid class name and case insensitive filesystem */
public final class C203689oX {
    public C204399pw A00;
    public C204419py A01;
    public AnonymousClass00S A02;
    public C006302t A03;
    public C006302t A04;
    public C006302t A05;
    public C006302t A06;
    public final BluetoothManager A07;
    public final Context A08;
    public final AnonymousClass888 A09;
    public final ArrayDeque A0A = new ArrayDeque();
    public final ConcurrentHashMap A0B;
    public final boolean A0C;
    public final AnonymousClass9DB A0D;
    public final String A0E;
    public final Executor A0F;

    public static final AnonymousClass63H A01(Context context, String str, int i) {
        PackageInfo packageInfo;
        AnonymousClass00C.A0D(str, 1);
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            if ((i & 64) == 64) {
                i = (i & -65) | 134217728;
            }
            if (i2 >= 33) {
                packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of((long) i));
            }
            packageInfo = packageManager.getPackageInfo(str, i);
        } else {
            if ((i & 134217728) == 134217728) {
                i = (i & -134217729) | 64;
            }
            packageInfo = packageManager.getPackageInfo(str, i);
        }
        if (packageInfo != null) {
            return new AnonymousClass63H(packageInfo);
        }
        throw new PackageManager.NameNotFoundException(AnonymousClass000.A0p("PackageManager returned null PackageInfo for ", str, AnonymousClass000.A0u()));
    }

    public static final boolean A0A(List list) {
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        if (C36351kA.A06(list, 0) > 126) {
            return true;
        }
        return C36351kA.A06(list, 0) == 126 && list.size() >= 5 && C36351kA.A06(list, 4) >= 20;
    }

    public static AnonymousClass63H A00(Context context, String str) {
        try {
            AnonymousClass63H A012 = A01(context, str, 64);
            String str2 = A012.A01;
            if (str.equals(str2)) {
                return A012;
            }
            throw new AnonymousClass78X(str, str2);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C21834AbC(AnonymousClass000.A0q(" not found by PackageManager.", AnonymousClass000.A0v(str)));
        } catch (RuntimeException e) {
            throw new SecurityException(e);
        }
    }

    private final PrivateKey A03() {
        C133076Wo r6 = this.A0D.A00;
        String str = null;
        C133076Wo.A01(r6);
        synchronized (r6.A02) {
            try {
                String A1A = C36431kI.A1A("app-private-key", r6.A05);
                if (A1A != null) {
                    str = A1A;
                }
            } catch (ClassCastException e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("LightSharedPreferences threw an exception for Key: ");
                A0u.append("app-private-key");
                A0u.append("; Raw file: ");
                throw C90524aI.A0e(AnonymousClass000.A0q(r6.A01.A00(), A0u), e);
            }
        }
        if (str != null) {
            C1896794t r0 = PrivateKey.Companion;
            byte[] decode = Base64.decode(str, 2);
            AnonymousClass00C.A08(decode);
            PrivateKey privateKey = new PrivateKey();
            privateKey.setRaw(decode);
            return privateKey;
        }
        AnonymousClass6YR.A06("lam:LinkedAppManager", "getAppPrivateKey: Generating new one");
        PrivateKey privateKey2 = new PrivateKey();
        privateKey2.generate();
        C133076Wo.A01(r6);
        C120855sC r3 = new C120855sC(r6);
        String A13 = C36441kJ.A13(privateKey2.serialize());
        if (!r3.A01) {
            Map map = r3.A00;
            if (A13 == null) {
                Objects.requireNonNull("app-private-key");
                map.put("app-private-key", C133076Wo.A0B);
            } else {
                Objects.requireNonNull("app-private-key");
                map.put("app-private-key", A13);
            }
            synchronized (r3) {
                if (!r3.A01) {
                    r3.A01 = true;
                } else {
                    throw C90514aH.A0s("Trying to freeze an editor that is already frozen!");
                }
            }
            try {
                C21899AcT acT = new C21899AcT();
                C133076Wo r62 = r3.A02;
                synchronized (r62.A02) {
                    try {
                        Iterator A0y = AnonymousClass000.A0y(map);
                        while (A0y.hasNext()) {
                            Map.Entry A11 = AnonymousClass000.A11(A0y);
                            String A0f = C90494aF.A0f(A11);
                            Object value = A11.getValue();
                            if (value == C133076Wo.A0B) {
                                r62.A05.remove(A0f);
                            } else {
                                Objects.requireNonNull(value);
                                Map map2 = r62.A05;
                                if (!value.equals(map2.get(A0f))) {
                                    map2.put(A0f, value);
                                }
                            }
                            acT.add(A0f);
                        }
                        r62.A09.compareAndSet(false, AnonymousClass000.A1Q(acT.isEmpty() ? 1 : 0));
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                map.clear();
                if (!acT.isEmpty()) {
                    synchronized (r62) {
                        try {
                            Throwable th2 = new Throwable("commit stack");
                            Iterator it = acT.iterator();
                            while (it.hasNext()) {
                                String A0C2 = AnonymousClass001.A0C(it);
                                C133076Wo.A02(r62, A0C2, th2, r62.A04);
                                Map map3 = (Map) r62.A06.get(A0C2);
                                if (map3 != null) {
                                    C133076Wo.A02(r62, A0C2, th2, map3);
                                }
                            }
                            r62.A00 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                    r62.A08.execute(new AnonymousClass759((Object) r3, 46));
                }
                synchronized (r3) {
                    r3.A01 = false;
                }
                return privateKey2;
            } catch (Throwable th4) {
                synchronized (r3) {
                    r3.A01 = false;
                    throw th4;
                }
            }
        } else {
            throw new ConcurrentModificationException("Editors shouldn't be modified during commit!");
        }
    }

    public static final void A04(C203689oX r3) {
        if (r3.A0C) {
            PublicKey recoverPublicKey = r3.A03().recoverPublicKey();
            AnonymousClass8NN A0p = C172598Ol.DEFAULT_INSTANCE.A0p();
            ((C172598Ol) A0p.A00).appPublicKey_ = C90474aD.A0O(A0p, recoverPublicKey.serialize());
            A09(new C22237Aiy(new AppLinkRegisterRequest((C172598Ol) A0p.A0R()), r3));
            return;
        }
        IllegalStateException A092 = AnonymousClass001.A09("Please update to MWA v127+ to use applinks");
        AnonymousClass6YR.A09("lam:LinkedAppManager", "registerLinkableAppService: unsupported", A092);
        throw A092;
    }

    public static final void A05(C203689oX r3) {
        ArrayDeque arrayDeque = r3.A0A;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            try {
                ((AnonymousClass00S) it.next()).invoke();
            } catch (Throwable th) {
                new AnonymousClass03N(th);
            }
        }
        arrayDeque.clear();
    }

    public static final void A06(C203689oX r10, Integer num, UUID uuid, C020008m r13) {
        C1888090u r3;
        UUID uuid2 = uuid;
        C020008m r4 = r13;
        if (!r10.A0C) {
            AnonymousClass6YR.A09("lam:LinkedAppManager", "getDeviceLinkInfo: Security not enabled.", (Throwable) null);
            r4.BKw(uuid2, C023409w.A00, (Object) null, (Object) null, (Object) null, (Object) null, (Object) null, (Object) null, (Object) null);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("getDeviceLinkInfo: transportType=");
        AnonymousClass6YR.A06("lam:LinkedAppManager", AnonymousClass000.A0q("BLE", A0u));
        if (num == C023109s.A0C) {
            r3 = C1888090u.IPV4;
        } else {
            r3 = C1888090u.BTC;
        }
        AnonymousClass8NN A0p = AnonymousClass8QW.DEFAULT_INSTANCE.A0p();
        AnonymousClass00C.A0D(uuid, 0);
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        C165587tf.A1P(wrap, uuid);
        byte[] array = wrap.array();
        AnonymousClass00C.A08(array);
        ((AnonymousClass8QW) A0p.A00).serviceUUID_ = C90474aD.A0O(A0p, array);
        ((AnonymousClass8QW) C90524aI.A0H(A0p)).linkType_ = r3.BEY();
        ((AnonymousClass8QW) C90524aI.A0H(A0p)).requestType_ = AnonymousClass90U.ACQUIRE.BEY();
        AppLinkLinkInfoRequest appLinkLinkInfoRequest = new AppLinkLinkInfoRequest((AnonymousClass8QW) A0p.A0R());
        C204419py r1 = r10.A01;
        if (r1 != null) {
            r1.A00(appLinkLinkInfoRequest, new AnonymousClass89I(r10, uuid, r13));
        }
    }

    public static final void A08(C203689oX r3, UUID uuid, C009003v r5) {
        if (!r3.A0C) {
            AnonymousClass6YR.A09("lam:LinkedAppManager", "getDeviceIdentity: Security not enabled.", (Throwable) null);
            r5.invoke(uuid, (Object) null);
            return;
        }
        AnonymousClass6YR.A06("lam:LinkedAppManager", "getDeviceIdentity: Security enabled.");
        AnonymousClass8NN A0p = C172588Ok.DEFAULT_INSTANCE.A0p();
        AnonymousClass00C.A0D(uuid, 0);
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        C165587tf.A1P(wrap, uuid);
        byte[] array = wrap.array();
        AnonymousClass00C.A08(array);
        ((C172588Ok) A0p.A00).serviceUUID_ = C90474aD.A0O(A0p, array);
        A09(new C22254AjF(new AppLinkDeviceIdentityRequest((C172588Ok) A0p.A0R()), r3, uuid, r5));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A0B() {
        /*
            r22 = this;
            java.lang.String r1 = "lam:LinkedAppManager"
            java.lang.String r0 = "start:"
            X.AnonymousClass6YR.A06(r1, r0)
            r1 = r22
            java.lang.String r0 = r1.A0E
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r0)
            r7 = 0
            X.BAo r4 = new X.BAo
            r4.<init>(r1, r7)
            android.content.Context r3 = r1.A08
            X.9CA r0 = X.C1693588w.A00
            java.util.concurrent.atomic.AtomicReference r6 = r0.A00
            java.lang.Object r8 = r6.get()
            if (r8 != 0) goto L_0x0044
            X.8zr r2 = X.C188608zr.A01
            java.lang.Integer r1 = X.C023109s.A0G
            X.A2a r0 = new X.A2a
            r0.<init>()
            monitor-enter(r2)
            X.88x r8 = new X.88x     // Catch:{ all -> 0x0032 }
            r8.<init>(r0, r2, r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0035
        L_0x0032:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0035:
            monitor-exit(r2)
            r0 = 0
            boolean r0 = r6.compareAndSet(r0, r8)
            if (r0 != 0) goto L_0x0044
            java.lang.Object r8 = r6.get()
            java.util.Objects.requireNonNull(r8)
        L_0x0044:
            X.AnonymousClass00C.A08(r8)
            X.9cy r8 = (X.C198139cy) r8
            monitor-enter(r8)
            monitor-enter(r8)     // Catch:{ all -> 0x03fd }
            X.88v r6 = r8.A00     // Catch:{ all -> 0x03fa }
            if (r6 != 0) goto L_0x00a3
            r0 = r8
            X.88x r0 = (X.C1693688x) r0     // Catch:{ all -> 0x03fa }
            monitor-enter(r8)     // Catch:{ all -> 0x03fa }
            X.9bX r10 = X.C198139cy.A08     // Catch:{ all -> 0x00a0 }
            X.6mG r9 = X.C198139cy.A07     // Catch:{ all -> 0x00a0 }
            X.8zr r1 = r0.A01     // Catch:{ all -> 0x00a0 }
            boolean r0 = r1 instanceof X.C23139B6z     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x009e
            X.B6z r1 = (X.C23139B6z) r1     // Catch:{ all -> 0x00a0 }
            int r0 = r1.A00     // Catch:{ all -> 0x00a0 }
            int r0 = 3 - r0
            if (r0 != 0) goto L_0x009e
            java.util.Set r0 = X.C197129bB.A1B     // Catch:{ all -> 0x00a0 }
            java.util.HashMap r6 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x00a0 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x00a0 }
        L_0x006f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x0083
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "*|all_packages|*"
            java.util.Set r0 = X.C165577te.A0r(r0)     // Catch:{ all -> 0x00a0 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00a0 }
            goto L_0x006f
        L_0x0083:
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r6)     // Catch:{ all -> 0x00a0 }
            X.6Np r0 = new X.6Np     // Catch:{ all -> 0x00a0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a0 }
            X.88y r2 = new X.88y     // Catch:{ all -> 0x00a0 }
            r2.<init>(r10, r9, r0)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r8)     // Catch:{ all -> 0x03fa }
            java.util.List r1 = r8.A04     // Catch:{ all -> 0x03fa }
            java.util.List r0 = r8.A03     // Catch:{ all -> 0x03fa }
            X.88v r6 = new X.88v     // Catch:{ all -> 0x03fa }
            r6.<init>(r2, r1, r0)     // Catch:{ all -> 0x03fa }
            r8.A00 = r6     // Catch:{ all -> 0x03fa }
            goto L_0x00a3
        L_0x009e:
            r0 = 0
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03fa }
            throw r0     // Catch:{ all -> 0x03fa }
        L_0x00a3:
            monitor-exit(r8)     // Catch:{ all -> 0x03fd }
            monitor-exit(r8)
            java.util.List r0 = r6.A01
            r21 = r0
            boolean r0 = r21.isEmpty()
            if (r0 == 0) goto L_0x00fe
            r20 = 0
        L_0x00b1:
            X.9Go r10 = r6.A00
            r9 = 0
            X.88y r10 = (X.C1693788y) r10
            r6 = 65600(0x10040, float:9.1925E-41)
            android.content.pm.PackageManager r2 = r3.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x00f9
            long r0 = (long) r6
            android.content.pm.PackageManager$ResolveInfoFlags r0 = android.content.pm.PackageManager.ResolveInfoFlags.of(r0)
            java.util.List r0 = r2.queryIntentServices(r5, r0)
        L_0x00cc:
            X.AnonymousClass00C.A0B(r0)
            if (r0 != 0) goto L_0x00d9
            java.util.List r11 = java.util.Collections.emptyList()
        L_0x00d5:
            X.7eo r8 = r10.A01
            goto L_0x0158
        L_0x00d9:
            java.util.ArrayList r11 = X.C165607th.A10()
            java.util.Iterator r2 = r0.iterator()
        L_0x00e1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r2.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ServiceInfo r1 = r0.serviceInfo
            if (r1 == 0) goto L_0x00e1
            android.content.pm.ApplicationInfo r0 = r1.applicationInfo
            if (r0 == 0) goto L_0x00e1
            r11.add(r1)
            goto L_0x00e1
        L_0x00f9:
            java.util.List r0 = r2.queryIntentServices(r5, r6)
            goto L_0x00cc
        L_0x00fe:
            java.lang.String r11 = "MSF_INTENT_METADATA_ID"
            java.lang.String r0 = r5.getStringExtra(r11)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r10 = "MSF_INTENT_METADATA_ORIGIN_PACKAGE_NAME"
            java.lang.String r9 = "MSF_INTENT_METADATA_LAUNCH_START_TIME"
            if (r0 == 0) goto L_0x014f
            java.security.SecureRandom r2 = new java.security.SecureRandom
            r2.<init>()
            r0 = 16
            byte[] r1 = new byte[r0]
            r2.nextBytes(r1)
            r0 = 8
            java.lang.String r8 = android.util.Base64.encodeToString(r1, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = r3.getPackageName()
            r5.putExtra(r11, r8)
            r5.putExtra(r9, r0)
            r5.putExtra(r10, r2)
        L_0x0131:
            X.94a r20 = new X.94a
            r20.<init>()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5)
            java.util.Iterator r1 = r21.iterator()
        L_0x013f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b1
            r1.next()
            java.lang.String r0 = "shouldObserve"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ Exception -> 0x013f }
            throw r0     // Catch:{ Exception -> 0x013f }
        L_0x014f:
            r0 = -1
            r5.getLongExtra(r9, r0)
            r5.getStringExtra(r10)
            goto L_0x0131
        L_0x0158:
            java.lang.ClassLoader r0 = r3.getClassLoader()     // Catch:{ Exception -> 0x0226 }
            r5.setExtrasClassLoader(r0)     // Catch:{ Exception -> 0x0226 }
            android.os.Bundle r2 = r5.getExtras()     // Catch:{ Exception -> 0x0226 }
            if (r2 != 0) goto L_0x0169
            android.os.Bundle r2 = X.AnonymousClass001.A07()     // Catch:{ Exception -> 0x0226 }
        L_0x0169:
            java.lang.ClassLoader r0 = r3.getClassLoader()     // Catch:{ Exception -> 0x0226 }
            r2.setClassLoader(r0)     // Catch:{ Exception -> 0x0226 }
            java.lang.String r0 = r3.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x017b }
            X.63H r0 = A01(r3, r0, r7)     // Catch:{ NameNotFoundException | RuntimeException -> 0x017b }
            java.lang.String r12 = r0.A02     // Catch:{ NameNotFoundException | RuntimeException -> 0x017b }
            goto L_0x017c
        L_0x017b:
            r12 = 0
        L_0x017c:
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0226 }
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0226 }
            org.json.JSONObject r6 = X.C36441kJ.A1B()     // Catch:{ Exception -> 0x0226 }
            java.lang.String r1 = "t"
            java.lang.String r0 = java.lang.Long.toString(r15)     // Catch:{ JSONException -> 0x01b2 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x01b2 }
            java.lang.String r1 = "r"
            java.lang.String r0 = java.lang.Long.toString(r13)     // Catch:{ JSONException -> 0x01b2 }
            r6.put(r1, r0)     // Catch:{ JSONException -> 0x01b2 }
            if (r12 == 0) goto L_0x01a1
            java.lang.String r0 = "v"
            r6.put(r0, r12)     // Catch:{ JSONException -> 0x01b2 }
        L_0x01a1:
            java.lang.String r1 = r6.toString()     // Catch:{  }
            java.lang.String r0 = "UTF-8"
            byte[] r1 = r1.getBytes(r0)     // Catch:{  }
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch:{  }
            goto L_0x01b3
        L_0x01b2:
            r0 = r9
        L_0x01b3:
            X.9JS r6 = new X.9JS     // Catch:{ Exception -> 0x0226 }
            r6.<init>()     // Catch:{ Exception -> 0x0226 }
            r6.A01 = r0     // Catch:{ Exception -> 0x0226 }
            java.lang.String r1 = "com.facebook.invalid_class.f4c3b00c"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x0226 }
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x0226 }
            r6.A00 = r0     // Catch:{ Exception -> 0x0226 }
            android.content.Intent r1 = X.C36431kI.A0D()     // Catch:{ Exception -> 0x0226 }
            android.content.ComponentName r0 = r6.A00     // Catch:{ Exception -> 0x0226 }
            r1.setComponent(r0)     // Catch:{ Exception -> 0x0226 }
            r1.setFlags(r7)     // Catch:{ Exception -> 0x0226 }
            java.lang.String r0 = r6.A01     // Catch:{ Exception -> 0x0226 }
            r1.setAction(r0)     // Catch:{ Exception -> 0x0226 }
            r1.setDataAndType(r9, r9)     // Catch:{ Exception -> 0x0226 }
            r1.setSourceBounds(r9)     // Catch:{ Exception -> 0x0226 }
            r1.setSelector(r9)     // Catch:{ Exception -> 0x0226 }
            r1.setClipData(r9)     // Catch:{ Exception -> 0x0226 }
            java.util.Set r0 = r6.A02     // Catch:{ Exception -> 0x0226 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ Exception -> 0x0226 }
        L_0x01e6:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x0226 }
            if (r0 == 0) goto L_0x01f4
            java.lang.String r0 = X.AnonymousClass001.A0C(r6)     // Catch:{ Exception -> 0x0226 }
            r1.addCategory(r0)     // Catch:{ Exception -> 0x0226 }
            goto L_0x01e6
        L_0x01f4:
            android.content.ComponentName r0 = r1.getComponent()     // Catch:{ Exception -> 0x0226 }
            if (r0 == 0) goto L_0x0216
            android.content.ComponentName r0 = r1.getComponent()     // Catch:{ Exception -> 0x0226 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x0226 }
            r1.setPackage(r0)     // Catch:{ Exception -> 0x0226 }
            r0 = 1140850688(0x44000000, float:512.0)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r3, r7, r1, r0)     // Catch:{ Exception -> 0x0226 }
            if (r1 == 0) goto L_0x021e
            java.lang.String r0 = "_ci_"
            r2.putParcelable(r0, r1)     // Catch:{ Exception -> 0x0226 }
            r5.putExtras(r2)     // Catch:{ Exception -> 0x0226 }
            goto L_0x0235
        L_0x0216:
            java.lang.String r0 = "Must generate PendingIntent based on an explicit intent."
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ Exception -> 0x0226 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0226 }
            goto L_0x0225
        L_0x021e:
            java.lang.String r0 = "Failed to generate CallerInfo metadata."
            X.92D r1 = new X.92D     // Catch:{ Exception -> 0x0226 }
            r1.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0226 }
        L_0x0225:
            throw r1     // Catch:{ Exception -> 0x0226 }
        L_0x0226:
            r1 = move-exception
            X.92D r0 = new X.92D     // Catch:{ 92D -> 0x022d }
            r0.<init>((java.lang.Exception) r1)     // Catch:{ 92D -> 0x022d }
            throw r0     // Catch:{ 92D -> 0x022d }
        L_0x022d:
            r2 = move-exception
            java.lang.String r1 = "CallerInfoHelper"
            java.lang.String r0 = "Error attaching caller info to Intent."
            r8.BoD(r1, r0, r2)
        L_0x0235:
            java.util.ArrayList r6 = X.C36361kB.A0r(r11)
            java.util.Iterator r19 = r11.iterator()
        L_0x023d:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x033a
            java.lang.Object r11 = r19.next()
            android.content.pm.ComponentInfo r11 = (android.content.pm.ComponentInfo) r11
            android.content.pm.ApplicationInfo r0 = r11.applicationInfo
            if (r0 == 0) goto L_0x023d
            java.lang.String r13 = r0.packageName
            X.6Np r1 = r10.A00     // Catch:{ SecurityException -> 0x0316 }
            int r12 = r0.uid     // Catch:{ SecurityException -> 0x0316 }
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ RuntimeException -> 0x030f }
            java.lang.String[] r2 = r0.getPackagesForUid(r12)     // Catch:{ RuntimeException -> 0x030f }
            if (r2 == 0) goto L_0x02f8
            int r0 = r2.length     // Catch:{ SecurityException -> 0x0316 }
            if (r0 == 0) goto L_0x02f8
            java.util.List r0 = java.util.Arrays.asList(r2)     // Catch:{ SecurityException -> 0x0316 }
            java.util.List r12 = java.util.Collections.unmodifiableList(r0)     // Catch:{ SecurityException -> 0x0316 }
            java.lang.String r0 = X.C36401kF.A0s(r12, r7)     // Catch:{ SecurityException -> 0x0316 }
            X.72I r0 = A02(r3, r0)     // Catch:{ SecurityException -> 0x0316 }
            java.util.List r2 = java.util.Collections.singletonList(r0)     // Catch:{ SecurityException -> 0x0316 }
            java.util.List r18 = java.util.Collections.unmodifiableList(r12)     // Catch:{ SecurityException -> 0x0316 }
            boolean r0 = r12.isEmpty()     // Catch:{ SecurityException -> 0x0316 }
            if (r0 != 0) goto L_0x0308
            java.lang.String r0 = r3.getPackageName()     // Catch:{ SecurityException -> 0x0316 }
            X.72I r12 = A02(r3, r0)     // Catch:{ SecurityException -> 0x0316 }
            java.util.Set r0 = X.C197129bB.A10     // Catch:{ SecurityException -> 0x0316 }
            boolean r14 = r0.contains(r12)     // Catch:{ SecurityException -> 0x0316 }
            boolean r0 = r2.isEmpty()     // Catch:{ SecurityException -> 0x0316 }
            if (r0 != 0) goto L_0x02f2
            java.lang.Object r0 = r2.get(r7)     // Catch:{ SecurityException -> 0x0316 }
            if (r0 == 0) goto L_0x02f2
            boolean r0 = r2.isEmpty()     // Catch:{ SecurityException -> 0x0316 }
            if (r0 != 0) goto L_0x02f2
            java.lang.Object r12 = r2.get(r7)     // Catch:{ SecurityException -> 0x0316 }
            X.72I r12 = (X.AnonymousClass72I) r12     // Catch:{ SecurityException -> 0x0316 }
            if (r12 == 0) goto L_0x02f2
            java.util.Set r0 = r1.A01     // Catch:{ SecurityException -> 0x0316 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ SecurityException -> 0x0316 }
        L_0x02ac:
            boolean r0 = r2.hasNext()     // Catch:{ SecurityException -> 0x0316 }
            if (r0 == 0) goto L_0x02bf
            java.lang.Object r0 = r2.next()     // Catch:{ SecurityException -> 0x0316 }
            X.72I r0 = (X.AnonymousClass72I) r0     // Catch:{ SecurityException -> 0x0316 }
            boolean r0 = X.C131066Np.A00(r12, r0, r14)     // Catch:{ SecurityException -> 0x0316 }
            if (r0 == 0) goto L_0x02ac
            goto L_0x0332
        L_0x02bf:
            java.util.Map r2 = r1.A00     // Catch:{ SecurityException -> 0x0316 }
            java.util.Iterator r17 = X.AnonymousClass000.A10(r2)     // Catch:{ SecurityException -> 0x0316 }
        L_0x02c5:
            boolean r0 = r17.hasNext()     // Catch:{ SecurityException -> 0x0316 }
            if (r0 == 0) goto L_0x02f2
            java.lang.Object r1 = r17.next()     // Catch:{ SecurityException -> 0x0316 }
            X.72I r1 = (X.AnonymousClass72I) r1     // Catch:{ SecurityException -> 0x0316 }
            boolean r0 = X.C131066Np.A00(r12, r1, r14)     // Catch:{ SecurityException -> 0x0316 }
            if (r0 == 0) goto L_0x02c5
            java.util.Iterator r16 = r18.iterator()     // Catch:{ SecurityException -> 0x0316 }
        L_0x02db:
            boolean r0 = r16.hasNext()     // Catch:{ SecurityException -> 0x0316 }
            if (r0 == 0) goto L_0x02c5
            java.lang.Object r15 = r16.next()     // Catch:{ SecurityException -> 0x0316 }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ SecurityException -> 0x0316 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ SecurityException -> 0x0316 }
            boolean r0 = r0.contains(r15)     // Catch:{ SecurityException -> 0x0316 }
            if (r0 == 0) goto L_0x02db
            goto L_0x0332
        L_0x02f2:
            X.9bX r0 = r10.A00     // Catch:{ SecurityException -> 0x0316 }
            monitor-enter(r0)     // Catch:{ SecurityException -> 0x0316 }
            monitor-exit(r0)     // Catch:{ SecurityException -> 0x0316 }
            goto L_0x023d
        L_0x02f8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SecurityException -> 0x0316 }
            java.lang.String r0 = "No packageName associated with uid="
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r12)     // Catch:{ SecurityException -> 0x0316 }
            X.AbC r0 = new X.AbC     // Catch:{ SecurityException -> 0x0316 }
            r0.<init>(r1)     // Catch:{ SecurityException -> 0x0316 }
            goto L_0x030e
        L_0x0308:
            java.lang.String r0 = "At least one package name is required"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ SecurityException -> 0x0316 }
        L_0x030e:
            throw r0     // Catch:{ SecurityException -> 0x0316 }
        L_0x030f:
            r1 = move-exception
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x0316 }
            r0.<init>(r1)     // Catch:{ SecurityException -> 0x0316 }
            throw r0     // Catch:{ SecurityException -> 0x0316 }
        L_0x0316:
            r12 = move-exception
            java.lang.String r2 = "FamilyIntentScope"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected exception in checking trusted app for "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r13, r1)
            r8.BoD(r2, r0, r12)
            X.9bX r2 = r10.A00
            monitor-enter(r2)
            java.lang.Integer r1 = r2.A00     // Catch:{ all -> 0x0337 }
            monitor-exit(r2)
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 != r0) goto L_0x0332
            goto L_0x023d
        L_0x0332:
            r6.add(r11)
            goto L_0x023d
        L_0x0337:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x033a:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0348
            java.lang.String r1 = "FamilyIntentScope"
            java.lang.String r0 = "No matching packages available."
            r8.BoD(r1, r0, r9)
            return
        L_0x0348:
            r1 = 1
            X.75S r0 = new X.75S
            r0.<init>()
            java.util.Collections.sort(r6, r0)
            java.lang.Object r7 = r6.get(r7)
            android.content.pm.PackageItemInfo r7 = (android.content.pm.PackageItemInfo) r7
            int r0 = r6.size()
            if (r0 <= r1) goto L_0x03c2
            java.util.Iterator r10 = r6.iterator()
        L_0x0361:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x03c2
            java.lang.Object r9 = r10.next()
            android.content.pm.PackageItemInfo r9 = (android.content.pm.PackageItemInfo) r9
            java.lang.String r2 = r9.packageName     // Catch:{ SecurityException -> 0x03ab }
            java.lang.String r0 = r3.getPackageName()     // Catch:{ SecurityException -> 0x03ab }
            X.63H r0 = A00(r3, r0)     // Catch:{ SecurityException -> 0x03ab }
            android.content.pm.ApplicationInfo r1 = r0.A00     // Catch:{ SecurityException -> 0x03ab }
            if (r1 == 0) goto L_0x039a
            X.63H r0 = A00(r3, r2)     // Catch:{ SecurityException -> 0x03ab }
            android.content.pm.ApplicationInfo r0 = r0.A00     // Catch:{ SecurityException -> 0x03ab }
            if (r0 == 0) goto L_0x0394
            int r2 = r1.uid     // Catch:{ SecurityException -> 0x03ab }
            int r1 = r0.uid     // Catch:{ SecurityException -> 0x03ab }
            if (r2 == r1) goto L_0x0361
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch:{ RuntimeException -> 0x03a4 }
            int r0 = r0.checkSignatures(r2, r1)     // Catch:{ RuntimeException -> 0x03a4 }
            if (r0 == 0) goto L_0x0361
            goto L_0x03c1
        L_0x0394:
            X.AbA r1 = new X.AbA     // Catch:{ SecurityException -> 0x03ab }
            r1.<init>(r2)     // Catch:{ SecurityException -> 0x03ab }
            goto L_0x03aa
        L_0x039a:
            java.lang.String r0 = r3.getPackageName()     // Catch:{ SecurityException -> 0x03ab }
            X.AbA r1 = new X.AbA     // Catch:{ SecurityException -> 0x03ab }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x03ab }
            goto L_0x03aa
        L_0x03a4:
            r0 = move-exception
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x03ab }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x03ab }
        L_0x03aa:
            throw r1     // Catch:{ SecurityException -> 0x03ab }
        L_0x03ab:
            r6 = move-exception
            java.lang.String r2 = "FamilyIntentScope"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error verifying the signature for "
            r1.append(r0)
            java.lang.String r0 = r9.packageName
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r8.BoD(r2, r0, r6)
            goto L_0x0361
        L_0x03c1:
            r7 = r9
        L_0x03c2:
            java.lang.String r2 = r7.packageName
            java.lang.String r1 = r7.name
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r2, r1)
            r5.setComponent(r0)
            if (r20 == 0) goto L_0x03f4
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x03f4
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5)
            java.util.Iterator r1 = r21.iterator()
        L_0x03e4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03f4
            r1.next()
            java.lang.String r0 = "shouldObserve"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ Exception -> 0x03e4 }
            throw r0     // Catch:{ Exception -> 0x03e4 }
        L_0x03f4:
            r0 = 513(0x201, float:7.19E-43)
            r3.bindService(r5, r4, r0)
            return
        L_0x03fa:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x03fd }
            throw r0     // Catch:{ all -> 0x03fd }
        L_0x03fd:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203689oX.A0B():void");
    }

    public final void A0C() {
        AnonymousClass6YR.A06("lam:LinkedAppManager", "stop:");
        AnonymousClass6YR.A06("lam:LinkedAppManager", "releaseMwaResources");
        if (this.A0C) {
            AnonymousClass8NN A0p = AnonymousClass8QW.DEFAULT_INSTANCE.A0p();
            ((AnonymousClass8QW) C90524aI.A0H(A0p)).requestType_ = AnonymousClass90U.RELEASE.BEY();
            A09(new C22238Aiz(new AppLinkLinkInfoRequest((AnonymousClass8QW) A0p.A0R()), this));
        }
        A05(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0036, code lost:
        if (A0A(X.AnonymousClass95I.A00(r5, "com.facebook.stella_debug")) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C203689oX(android.bluetooth.BluetoothManager r4, android.content.Context r5, X.AnonymousClass9DB r6, X.AnonymousClass888 r7, java.util.concurrent.Executor r8) {
        /*
            r3 = this;
            boolean r2 = X.C90484aE.A1U(r4)
            r3.<init>()
            r3.A08 = r5
            r3.A07 = r4
            r3.A0F = r8
            r3.A0D = r6
            r3.A09 = r7
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.A0A = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r2)
            r3.A0B = r0
            java.lang.String r0 = "com.facebook.stella"
            java.util.List r0 = X.AnonymousClass95I.A00(r5, r0)
            boolean r0 = A0A(r0)
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "com.facebook.stella_debug"
            java.util.List r0 = X.AnonymousClass95I.A00(r5, r0)
            boolean r1 = A0A(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            r3.A0C = r0
            boolean r0 = r7.A01
            if (r0 != r2) goto L_0x0044
            java.lang.String r0 = "com.facebook.wearable.applinks.AppLinkService.BIND"
        L_0x0041:
            r3.A0E = r0
            return
        L_0x0044:
            r2 = 0
            java.lang.String r1 = "lam:LinkedAppManager"
            java.lang.String r0 = "Please enable FBPermissionService for secure IPC in release builds."
            X.AnonymousClass6YR.A0B(r1, r0, r2)
            java.lang.String r0 = "com.facebook.wearable.applinks.InsecureAppLinkService.BIND"
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203689oX.<init>(android.bluetooth.BluetoothManager, android.content.Context, X.9DB, X.888, java.util.concurrent.Executor):void");
    }

    public static AnonymousClass72I A02(Context context, String str) {
        AnonymousClass63H A002 = A00(context, str);
        C128106Ax A003 = A002.A00();
        if (A003 != null) {
            List list = A003.A00;
            if (list.size() <= 1) {
                byte[] byteArray = ((Signature) C36391kE.A0t(list)).toByteArray();
                try {
                    byte[] A1a = C90504aG.A1a(byteArray, "SHA-1");
                    AnonymousClass00C.A08(A1a);
                    String encodeToString = Base64.encodeToString(A1a, 11);
                    AnonymousClass00C.A08(encodeToString);
                    byte[] A1a2 = C90504aG.A1a(byteArray, "SHA-256");
                    AnonymousClass00C.A08(A1a2);
                    String encodeToString2 = Base64.encodeToString(A1a2, 11);
                    AnonymousClass00C.A08(encodeToString2);
                    return C165617ti.A0D("test", encodeToString, encodeToString2);
                } catch (NoSuchAlgorithmException unused) {
                    throw new SecurityException("Error obtaining SHA1/SHA256");
                }
            } else {
                throw new C21833AbB(A002.A01);
            }
        } else {
            throw new C21835AbD(A002.A01);
        }
    }

    public static final void A07(C203689oX r3, UUID uuid, C006302t r5, byte[] bArr) {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("handleSecurity: devicePublicKey=");
        AnonymousClass887 r2 = null;
        if (bArr != null) {
            str = AnonymousClass02R.A0A(C22510Ans.A00, bArr);
        } else {
            str = null;
        }
        AnonymousClass6YR.A06("lam:LinkedAppManager", AnonymousClass000.A0q(str, A0u));
        if (bArr != null) {
            PrivateKey A032 = r3.A03();
            PublicKey publicKey = new PublicKey((HybridData) null);
            publicKey.setRaw(bArr);
            r2 = new AnonymousClass887(A032, publicKey, uuid);
        }
        r5.invoke(r2);
    }

    public static final void A09(AnonymousClass00S r2) {
        Object obj;
        try {
            obj = r2.invoke();
        } catch (Throwable th) {
            obj = C90524aI.A0t(th);
        }
        Throwable A002 = AnonymousClass0AK.A00(obj);
        if (A002 != null) {
            AnonymousClass6YR.A09("lam:LinkedAppManager", "runSafely: error", A002);
        }
    }
}
