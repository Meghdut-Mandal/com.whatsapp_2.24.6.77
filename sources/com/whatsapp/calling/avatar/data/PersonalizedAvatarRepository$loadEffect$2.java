package com.whatsapp.calling.avatar.data;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass6CC;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$loadEffect$2", f = "PersonalizedAvatarRepository.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
public final class PersonalizedAvatarRepository$loadEffect$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass6CC $arEffect;
    public final /* synthetic */ String $productSessionId;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ PersonalizedAvatarRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PersonalizedAvatarRepository$loadEffect$2(PersonalizedAvatarRepository personalizedAvatarRepository, AnonymousClass6CC r3, String str, C023509x r5) {
        super(2, r5);
        this.$arEffect = r3;
        this.$productSessionId = str;
        this.this$0 = personalizedAvatarRepository;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new PersonalizedAvatarRepository$loadEffect$2(this.this$0, this.$arEffect, this.$productSessionId, r6);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            r46 = this;
            r3 = r47
            X.0AO r16 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r2 = r46
            int r1 = r2.label
            r0 = 1
            if (r1 == 0) goto L_0x0011
            if (r1 != r0) goto L_0x06d0
            X.AnonymousClass0AN.A00(r3)
        L_0x0010:
            return r3
        L_0x0011:
            X.AnonymousClass0AN.A00(r3)
            X.6CC r1 = r2.$arEffect
            java.lang.String r7 = r2.$productSessionId
            com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository r6 = r2.this$0
            r2.L$0 = r1
            r2.L$1 = r7
            r2.L$2 = r6
            r2.label = r0
            X.0AR r17 = X.C36371kC.A12(r2)
            java.lang.String r0 = r1.A01
            r20 = r0
            X.6DC r11 = r1.A00
            X.6Dg r2 = r11.A00
            java.lang.String r0 = r2.A02
            r19 = r0
            java.lang.String r0 = r2.A05
            r18 = r0
            java.lang.String r31 = "1001"
            java.lang.String r32 = ""
            java.lang.String r15 = r2.A04
            java.lang.String r14 = r11.A02
            int r0 = r2.A00
            long r12 = (long) r0
            int r0 = r2.A01
            long r0 = (long) r0
            java.lang.String r2 = r2.A03
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r26 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.fromString(r2)
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            java.util.List r9 = r11.A03
            int r8 = r9.size()
            r5 = 0
        L_0x0055:
            if (r5 >= r8) goto L_0x0072
            java.lang.Object r2 = r9.get(r5)
            X.69r r2 = (X.C1277969r) r2
            java.lang.String r3 = r2.A01
            com.facebook.cameracore.ardelivery.model.VersionedCapability r4 = com.facebook.cameracore.ardelivery.model.VersionedCapability.fromServerValue(r3)
            if (r4 == 0) goto L_0x006f
            int r3 = r2.A00
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r2 = new com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling
            r2.<init>((com.facebook.cameracore.ardelivery.model.VersionedCapability) r4, (int) r3)
            r10.add(r2)
        L_0x006f:
            int r5 = r5 + 1
            goto L_0x0055
        L_0x0072:
            java.util.List r40 = X.C007103b.A0Y(r10)
            java.lang.String r2 = r11.A01
            r22 = 0
            com.facebook.cameracore.ardelivery.model.EffectAssetType r27 = com.facebook.cameracore.ardelivery.model.EffectAssetType.NORMAL_EFFECT
            com.facebook.cameracore.ardelivery.model.ARAssetType r23 = com.facebook.cameracore.ardelivery.model.ARAssetType.EFFECT
            r41 = -1
            java.lang.Integer r30 = X.C023109s.A00
            r29 = r22
            r38 = r19
            X.6c3 r24 = new X.6c3
            r25 = r23
            r28 = r22
            r33 = r20
            r34 = r19
            r35 = r18
            r36 = r15
            r37 = r14
            r39 = r2
            r42 = r12
            r44 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44)
            X.63r r1 = new X.63r
            r1.<init>()
            r1.A03 = r7
            java.lang.String r0 = "whatsapp"
            r1.A02 = r0
            X.6SG r1 = r1.A00()
            r19 = 1
            X.6YZ r18 = new X.6YZ
            r3 = 1
            r2 = r18
            r0 = r17
            r2.<init>(r0, r3)
            X.005 r0 = r6.A02
            java.lang.Object r0 = r0.get()
            X.5kg r0 = (X.C116495kg) r0
            X.5z1 r2 = r0.A00
            X.6k5 r0 = r2.A0C
            if (r0 != 0) goto L_0x041e
            X.6k5 r0 = r2.A0C
            if (r0 != 0) goto L_0x041e
            X.0wG r0 = r2.A08
            android.content.Context r0 = r0.A00
            X.4rS r8 = new X.4rS
            r8.<init>(r0)
            r3 = 110(0x6e, float:1.54E-43)
            r0 = r22
            java.io.File r7 = r8.BJG(r0, r3)
            r7.mkdirs()
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ed
            r7.setLastModified(r3)
        L_0x00ed:
            X.6MU r3 = new X.6MU
            r3.<init>()
            X.7eq r0 = r8.A01
            X.C109565Yb.A00(r0, r3, r7)
            java.lang.String r0 = "tmp_extract"
            java.io.File r0 = X.C36441kJ.A0w(r7, r0)
            X.77U r9 = new X.77U
            r9.<init>(r0)
            X.6Rz r3 = r2.A09
            X.5ZV r0 = r2.A07
            r20 = r0
            X.5p4 r10 = new X.5p4
            r10.<init>(r0, r3)
            r3 = 106(0x6a, float:1.49E-43)
            r5 = 100
            r12 = 20
            long r5 = r5 << r12
            X.77W r0 = new X.77W
            r0.<init>(r10, r3, r5)
            java.lang.Object r0 = r0.get()
            X.7ea r0 = (X.C157727ea) r0
            X.6jx r8 = new X.6jx
            r8.<init>(r0)
            r11 = 109(0x6d, float:1.53E-43)
            r3 = 1
            long r3 = r3 << r12
            X.77W r0 = new X.77W
            r0.<init>(r10, r11, r3)
            java.lang.Object r0 = r0.get()
            X.7ea r0 = (X.C157727ea) r0
            X.6jx r11 = new X.6jx
            r11.<init>(r0)
            java.util.LinkedHashMap r0 = X.C36431kI.A1G()
            com.facebook.cameracore.ardelivery.model.VersionedCapability r12 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Facetracker
            r3 = 25
            X.C36421kH.A1K(r12, r0, r3)
            X.5ze r14 = new X.5ze
            r14.<init>()
            java.util.LinkedHashMap r13 = X.C36431kI.A1G()
            java.lang.Object r3 = r0.get(r12)
            if (r3 != 0) goto L_0x01b6
            r3 = 100
        L_0x0155:
            r15 = 107(0x6b, float:1.5E-43)
            r0 = 20
            long r3 = r3 << r0
            X.77W r0 = new X.77W
            r0.<init>(r10, r15, r3)
            java.lang.Object r0 = r0.get()
            X.7ea r0 = (X.C157727ea) r0
            X.6jx r4 = new X.6jx
            r4.<init>(r0)
            X.77T r3 = new X.77T
            r3.<init>(r0)
            X.4qP r0 = new X.4qP
            r0.<init>(r12, r4, r14, r3)
            r13.put(r12, r0)
            r3 = 108(0x6c, float:1.51E-43)
            X.77W r0 = new X.77W
            r0.<init>(r10, r3, r5)
            java.lang.Object r0 = r0.get()
            X.7ea r0 = (X.C157727ea) r0
            X.6jx r5 = new X.6jx
            r5.<init>(r0)
            X.77T r4 = new X.77T
            r4.<init>(r0)
            X.00T r6 = X.C114005gU.A00
            java.lang.Object r3 = X.C36381kD.A0p(r6)
            X.1Ak r3 = (X.C23931Ak) r3
            X.4qQ r0 = new X.4qQ
            r0.<init>(r5, r3, r14, r4)
            java.lang.Object r3 = X.C36381kD.A0p(r6)
            X.0y6 r3 = (X.C20750y6) r3
            X.14x r4 = r3.iterator()
        L_0x01a5:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x01c1
            java.lang.Object r3 = r4.next()
            X.AnonymousClass00C.A0B(r3)
            r13.put(r3, r0)
            goto L_0x01a5
        L_0x01b6:
            java.lang.Object r0 = r0.get(r12)
            if (r0 == 0) goto L_0x06d5
            long r3 = X.C36431kI.A09(r0)
            goto L_0x0155
        L_0x01c1:
            X.4qO r3 = new X.4qO
            r3.<init>(r0, r13)
            java.util.LinkedHashMap r6 = X.C36431kI.A1G()
            r0 = r23
            r6.put(r0, r8)
            com.facebook.cameracore.ardelivery.model.ARAssetType r4 = com.facebook.cameracore.ardelivery.model.ARAssetType.SUPPORT
            r6.put(r4, r3)
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.SCRIPTING_PACKAGE
            r6.put(r0, r11)
            X.4qN r5 = new X.4qN
            r5.<init>(r6)
            X.5hd r0 = new X.5hd
            r0.<init>(r9)
            X.6jy r3 = new X.6jy
            r11 = r0
            r12 = r0
            r13 = r0
            r14 = r0
            r15 = r0
            r8 = r3
            r9 = r5
            r10 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            X.0wU r8 = r2.A0A
            java.lang.String r0 = "AR Delivery Thread"
            r6 = 3
            X.0wV r8 = (X.C19780wV) r8
            X.77G r5 = new X.77G
            r5.<init>(r0)
            X.79U r0 = new X.79U
            r0.<init>(r8, r5, r6)
            r5 = 1
            r0.allowCoreThreadTimeOut(r5)
            X.6kA r5 = new X.6kA
            r5.<init>(r2)
            java.lang.String r6 = "tmp_download"
            java.io.File r12 = X.C36441kJ.A0w(r7, r6)
            X.5ze r29 = new X.5ze
            r29.<init>()
            X.5kD r6 = r2.A00
            X.0w7 r6 = r6.A00
            X.0tq r6 = r6.A00
            X.0wU r11 = X.C36341k9.A0Z(r6)
            X.0ww r8 = X.C36381kD.A0U(r6)
            X.13E r9 = X.C90494aF.A0L(r6)
            X.004 r6 = r6.A7U
            java.lang.Object r10 = r6.get()
            X.0yd r10 = (X.C21080yd) r10
            X.5w0 r7 = new X.5w0
            r7.<init>(r8, r9, r10, r11, r12)
            X.5kh r6 = r2.A06
            X.6Ug r26 = new X.6Ug
            r8 = r26
            r9 = r5
            r10 = r7
            r11 = r6
            r12 = r29
            r13 = r20
            r8.<init>(r9, r10, r11, r12, r13)
            X.6PQ r6 = r2.A04
            r32 = r0
            r33 = r0
            X.6Xw r25 = new X.6Xw
            r27 = r3
            r28 = r6
            r30 = r13
            r31 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            X.4qN r5 = r3.A01
            X.7lF r4 = r5.A00(r4)
            X.4qO r4 = (X.C97864qO) r4
            X.AnonymousClass00C.A08(r4)
            X.6ju r8 = r2.A01
            X.6js r7 = new X.6js
            r7.<init>(r4)
            X.4qQ r5 = r4.A00
            X.6jr r4 = new X.6jr
            r4.<init>(r5)
            X.6Sr r9 = new X.6Sr
            r10 = r25
            r11 = r4
            r12 = r7
            r13 = r8
            r14 = r6
            r15 = r20
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.60d r4 = r2.A02
            X.5vn r7 = new X.5vn
            r8 = r9
            r9 = r4
            r10 = r6
            r11 = r15
            r12 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            java.util.HashMap r8 = X.AnonymousClass001.A0J()
            java.lang.String r5 = "AnimationModule"
            java.lang.String r4 = "a9416b047d685d3f15fd04a5bc45c34eadfea2a4"
            r8.put(r5, r4)
            java.lang.String r5 = "AssetsModule"
            java.lang.String r4 = "9af3fb78670fd7666028818a1730be583cb56a18"
            r8.put(r5, r4)
            java.lang.String r5 = "AudioModule"
            java.lang.String r4 = "36dbd1c784057d78e9c16b7b5067e924b1516a12"
            r8.put(r5, r4)
            java.lang.String r5 = "AvatarModule"
            java.lang.String r4 = "80fab7774c7b88828f35eb9ca25e917aae7aea92"
            r8.put(r5, r4)
            java.lang.String r5 = "BlocksModule"
            java.lang.String r4 = "216e3d7a8d4e78ecc7f884c8efe4245d457d5e8b"
            r8.put(r5, r4)
            java.lang.String r5 = "CameraInfoModule"
            java.lang.String r4 = "800a2613af7da522ca99150ab669a9eaf2231477"
            r8.put(r5, r4)
            java.lang.String r5 = "CapabilitiesModule"
            java.lang.String r4 = "7eb80207d574baaa40650617c83e4686360e6c4a"
            r8.put(r5, r4)
            java.lang.String r5 = "ComposedMaterialDynamicInstantiation"
            java.lang.String r4 = "dd215d9e2ee0a0768a24b827176c54323fe3dfcc"
            r8.put(r5, r4)
            java.lang.String r5 = "CoreModule"
            java.lang.String r4 = "14f3a5d288215ff543b586b1973f919c2d64f32c"
            r8.put(r5, r4)
            java.lang.String r5 = "DeviceMotionModule"
            java.lang.String r4 = "50fc5a51c508a3b12f67d7e17eb8494090b16ce1"
            r8.put(r5, r4)
            java.lang.String r5 = "DiagnosticsModule"
            java.lang.String r4 = "076484314d9d8fc5e66ba9838085a41616492c55"
            r8.put(r5, r4)
            java.lang.String r5 = "FaceGesturesModule"
            java.lang.String r4 = "a2ea6ba24d0d84da2e5b15cdecc33eefa9cdf3ce"
            r8.put(r5, r4)
            java.lang.String r5 = "FaceSceneModule"
            java.lang.String r4 = "9f44036ae25a630de7f31f2613657849c73f1a29"
            r8.put(r5, r4)
            java.lang.String r5 = "FaceTrackingModule"
            java.lang.String r4 = "cfd2a3880902daa36c6efd62b0448e510266f8ea"
            r8.put(r5, r4)
            java.lang.String r5 = "FacialActionsModule"
            java.lang.String r4 = "c9da3fa59d2c0b62901018ca4e682c9c413dc9fa"
            r8.put(r5, r4)
            java.lang.String r5 = "FontsModule"
            java.lang.String r4 = "c9f6afdec8c650f8bb122353b74da3aeebac45e4"
            r8.put(r5, r4)
            java.lang.String r5 = "GalleryTextureModule"
            java.lang.String r4 = "273ab023a2667cb1d8e375397cdd780063b92bff"
            r8.put(r5, r4)
            java.lang.String r5 = "InstructionModule"
            java.lang.String r4 = "ae57f28711c6e8c23ba51c4016a6942a27c3e685"
            r8.put(r5, r4)
            java.lang.String r5 = "InstructionModuleExtension"
            java.lang.String r4 = "a8df79185606b246c75c88c52b66f72830de9bfd"
            r8.put(r5, r4)
            java.lang.String r5 = "IrisTrackingModule"
            java.lang.String r4 = "08f35387fe2a4d29b289d31305179bdba1f8f48f"
            r8.put(r5, r4)
            java.lang.String r5 = "LayersModule"
            java.lang.String r4 = "c3178b1e9859e303e29f45191a9860aa4601789e"
            r8.put(r5, r4)
            java.lang.String r5 = "MaterialsModule"
            java.lang.String r4 = "5fb6df0c479b0adbb543e5d22b27e43dc749688a"
            r8.put(r5, r4)
            java.lang.String r5 = "MaterialsShadersExtension"
            java.lang.String r4 = "abd7db0edd16510328327c9b37e809af371d041c"
            r8.put(r5, r4)
            java.lang.String r5 = "NativeUIModule"
            java.lang.String r4 = "1506b64331b8501112c8dbb66a2b23ef74f6dc5d"
            r8.put(r5, r4)
            java.lang.String r5 = "PatchesModule"
            java.lang.String r4 = "14911bb3ffc1c71d21eede453291f1e06213581c"
            r8.put(r5, r4)
            java.lang.String r5 = "PersonSegmentationModule"
            java.lang.String r4 = "214e98af74bc360dcabaf9f3ed595c8c02022203"
            r8.put(r5, r4)
            java.lang.String r5 = "PlanarTextModule"
            java.lang.String r4 = "71344ee57ed2961278e9aa85952d494f914c35db"
            r8.put(r5, r4)
            java.lang.String r5 = "PlatformEventsModule"
            java.lang.String r4 = "dabc6f84b4b97dda6eca320de409f2f0221b3bef"
            r8.put(r5, r4)
            java.lang.String r5 = "PrefabsModule"
            java.lang.String r4 = "6d29e38a79a04615bcd8162018d09d90c84f05a3"
            r8.put(r5, r4)
            java.lang.String r5 = "RandomModule"
            java.lang.String r4 = "7a45e21503cf3837a200da3011ba728759c7c912"
            r8.put(r5, r4)
            java.lang.String r5 = "ReactiveLogicExtension"
            java.lang.String r4 = "c95348bf6861e2d7ee307c82b5268efc71a11a97"
            r8.put(r5, r4)
            java.lang.String r5 = "ReactiveMathExtension"
            java.lang.String r4 = "49bde7d9d318c292b3fa394ec7d7c1af19c95103"
            r8.put(r5, r4)
            java.lang.String r5 = "ReactiveModule"
            java.lang.String r4 = "caa59ec8206031e5802816d06b1434d065ec9cdf"
            r8.put(r5, r4)
            java.lang.String r5 = "ReactiveUtilExtension"
            java.lang.String r4 = "2fddbec4fcaa578cba97575e5a22c326f7101c31"
            r8.put(r5, r4)
            java.lang.String r5 = "RuntimeModule"
            java.lang.String r4 = "ffbc9537eb12eea1f89e8671bf0ed55002365aa4"
            r8.put(r5, r4)
            java.lang.String r5 = "SceneModule"
            java.lang.String r4 = "ba57548ce021a322a6e0a57f7b4f3b9994ad3aac"
            r8.put(r5, r4)
            java.lang.String r5 = "SegmentationModule"
            java.lang.String r4 = "4607d5782fa05404ae42de07c5da25e26708813e"
            r8.put(r5, r4)
            java.lang.String r5 = "ShadersModule"
            java.lang.String r4 = "4a256ef9d8d11f1974274c1beea1672329112181"
            r8.put(r5, r4)
            java.lang.String r5 = "SystraceModule"
            java.lang.String r4 = "8817929726b84ffc5e9e127066d439b1bf832cd8"
            r8.put(r5, r4)
            java.lang.String r5 = "TextExtrusionModule"
            java.lang.String r4 = "244dc3bd215590d99c2b48564786f29fad56b6a9"
            r8.put(r5, r4)
            java.lang.String r5 = "TexturesModule"
            java.lang.String r4 = "152f6337902c2315fb45bc26a0e1bec485836066"
            r8.put(r5, r4)
            java.lang.String r5 = "TimeModule"
            java.lang.String r4 = "1fb326fc980746e53c91adee08d2b4c034ad52c6"
            r8.put(r5, r4)
            java.lang.String r5 = "TimeModuleExtension"
            java.lang.String r4 = "4c9439cae464c3b531ac407a2e4820b6bcca05f2"
            r8.put(r5, r4)
            java.lang.String r5 = "TouchGesturesModule"
            java.lang.String r4 = "32b3a1246404a466849e3c9e6db904320c0b6bff"
            r8.put(r5, r4)
            java.lang.String r5 = "UnitsModule"
            java.lang.String r4 = "d41439446b8b6774ff7cdbe06975ad84bb732987"
            r8.put(r5, r4)
            java.lang.String r5 = "VisualShadersExtension"
            java.lang.String r4 = "d92e19a0706bde9c4cf161ff9a177251187723d2"
            r8.put(r5, r4)
            java.lang.String r5 = "VisualTimeExtension"
            java.lang.String r4 = "f2b5ead5ff6de527007cb9363c81d503c5589c35"
            r8.put(r5, r4)
            java.lang.String r5 = "WorkerModule"
            java.lang.String r4 = "27cfebf44f6ed3e187f05398ceeb8d46996892a7"
            r8.put(r5, r4)
            java.lang.String r5 = "arfx"
            java.lang.String r4 = "ddd7b11cb83722916bbcec0981cbf16be4bb1dcb"
            r8.put(r5, r4)
            java.lang.String r5 = "arfx_polyfill"
            java.lang.String r4 = "e12262d01285f417d7ede31a47497d1471ab0f67"
            r8.put(r5, r4)
            X.5kf r4 = r2.A03
            X.5wp r29 = new X.5wp
            r9 = r29
            r10 = r25
            r11 = r4
            r12 = r6
            r13 = r15
            r14 = r8
            r15 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            X.5cX r33 = new X.5cX
            r33.<init>()
            X.4xI r5 = r2.A05
            X.6k5 r4 = new X.6k5
            r26 = r4
            r27 = r10
            r28 = r7
            r30 = r6
            r31 = r5
            r32 = r13
            r34 = r0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)
            r2.A0C = r4
            X.6K1 r0 = new X.6K1
            r0.<init>(r7, r3)
            r2.A0D = r0
        L_0x041e:
            X.6k5 r0 = r2.A0C
            java.lang.String r21 = "Required value was null."
            if (r0 == 0) goto L_0x06ea
            X.6k5 r4 = r2.A0C
            if (r4 == 0) goto L_0x06e5
            java.util.List r20 = X.C36371kC.A11(r24)
            r0 = 0
            r1.A02 = r0
            java.util.Objects.requireNonNull(r1)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r6 = r20.iterator()
        L_0x043a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0452
            java.lang.Object r3 = r6.next()
            X.6c3 r3 = (X.C135056c3) r3
            X.6VA r0 = r3.A01
            com.facebook.cameracore.ardelivery.model.ARAssetType r2 = r0.A02
            r0 = r23
            if (r2 != r0) goto L_0x043a
            r5.add(r3)
            goto L_0x043a
        L_0x0452:
            int r2 = r5.size()
            r0 = 1
            if (r2 == r0) goto L_0x0497
            X.63o r3 = new X.63o
            r3.<init>()
            X.5Ti r0 = X.C108395Ti.REQUEST_ASSET_CREATION_FAILURE
            r3.A00 = r0
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0494
            java.lang.String r0 = "effect asset is missing"
        L_0x046a:
            r3.A01 = r0
            r2 = 9
            X.74w r1 = new X.74w
            r0 = r18
            r1.<init>(r4, r3, r0, r2)
            r1.run()
            r2 = r22
            X.6jk r3 = new X.6jk
            r0 = r20
            r3.<init>(r4, r2, r2, r0)
        L_0x0481:
            X.7SP r1 = new X.7SP
            r1.<init>(r3)
            r0 = r17
            r0.BL1(r1)
            java.lang.Object r3 = r17.A0G()
            r0 = r16
            if (r3 != r0) goto L_0x0010
            return r16
        L_0x0494:
            java.lang.String r0 = "can't load more than one effect at once"
            goto L_0x046a
        L_0x0497:
            r0 = 0
            java.lang.Object r7 = r5.get(r0)
            X.6c3 r7 = (X.C135056c3) r7
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x04fa
            java.lang.String r2 = r4.A00
            if (r2 == 0) goto L_0x04f4
            X.6PQ r10 = r4.A05
            java.util.Map r0 = r10.A04
            java.lang.Object r9 = r0.get(r2)
            X.6SG r9 = (X.AnonymousClass6SG) r9
            if (r9 == 0) goto L_0x04f4
            r0.remove(r2)
            boolean r0 = X.AnonymousClass6PQ.A00(r9, r10)
            if (r0 != 0) goto L_0x04d7
            X.4xH r8 = r10.A01
            long r5 = X.C101274xH.A00(r9, r8)
            monitor-enter(r8)
            long r2 = r8.A00     // Catch:{ all -> 0x06da }
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x04cc
            r2 = 0
            r8.A00 = r2     // Catch:{ all -> 0x06da }
        L_0x04cc:
            monitor-exit(r8)
            r8.A01(r5)
            java.util.Map r2 = r10.A03
            java.lang.String r0 = r9.A01
            r2.remove(r0)
        L_0x04d7:
            java.lang.String r0 = r9.A00
            if (r0 == 0) goto L_0x04f4
            X.4xI r5 = r4.A06
            X.00T r0 = r5.A00
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 != 0) goto L_0x04ea
            boolean r2 = r9.A02
            r0 = 0
            if (r2 == 0) goto L_0x04eb
        L_0x04ea:
            r0 = 1
        L_0x04eb:
            if (r0 != 0) goto L_0x04f4
            long r2 = X.C101284xI.A00(r9, r5)
            r5.A01(r2)
        L_0x04f4:
            X.6VA r0 = r7.A01
            java.lang.String r0 = r0.A0A
            r4.A00 = r0
        L_0x04fa:
            X.4xI r6 = r4.A06
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.6VA r0 = r7.A01
            java.lang.String r9 = r0.A0A
            X.AnonymousClass00C.A08(r9)
            java.lang.String r10 = r0.A0B
            X.00T r0 = r6.A00
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 != 0) goto L_0x0516
            boolean r2 = r1.A02
            r0 = 0
            if (r2 == 0) goto L_0x0517
        L_0x0516:
            r0 = 1
        L_0x0517:
            if (r0 != 0) goto L_0x053e
            long r2 = X.C101284xI.A00(r1, r6)
            r6.A02(r2)
            r22 = r6
            r23 = r1
            r24 = r9
            r25 = r10
            r26 = r2
            r22.A06(r23, r24, r25, r26)
            java.lang.String r5 = r1.A00
            X.AnonymousClass00C.A08(r5)
            java.lang.String r0 = "marker_start_zero"
            r6.A05(r2, r0, r5)
            java.lang.String r5 = "oc_ar_xlogger"
            java.lang.String r0 = "false"
            r6.A04(r2, r5, r0)
        L_0x053e:
            X.6PQ r3 = r4.A05
            java.util.Map r0 = r3.A04
            X.AnonymousClass00C.A07(r0)
            r0.put(r9, r1)
            boolean r0 = X.AnonymousClass6PQ.A00(r1, r3)
            if (r0 != 0) goto L_0x05a4
            java.util.Map r2 = r3.A03
            X.AnonymousClass00C.A07(r2)
            java.lang.String r11 = r1.A01
            X.5w1 r0 = new X.5w1
            r0.<init>(r7)
            r2.put(r11, r0)
            X.4xH r8 = r3.A01
            long r5 = X.C101274xH.A00(r1, r8)
            monitor-enter(r8)
            long r2 = r8.A00     // Catch:{ all -> 0x06da }
            r12 = 0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0571
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0571
            goto L_0x0573
        L_0x0571:
            r0 = 0
            goto L_0x0577
        L_0x0573:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x06da }
        L_0x0577:
            r8.A00 = r5     // Catch:{ all -> 0x06da }
            monitor-exit(r8)
            if (r0 == 0) goto L_0x0583
            long r2 = r0.longValue()
            r8.A01(r2)
        L_0x0583:
            r8.A02(r5)
            r22 = r8
            r23 = r1
            r24 = r9
            r25 = r10
            r26 = r5
            r22.A06(r23, r24, r25, r26)
            java.util.Map r0 = r8.A01
            r0.get(r11)
            java.lang.String r0 = "connection_class"
            java.lang.String r2 = "UNKNOWN"
            r8.A04(r5, r0, r2)
            java.lang.String r0 = "connection_name"
            r8.A04(r5, r0, r2)
        L_0x05a4:
            X.5YD r0 = r4.A02
            r26 = r0
            java.lang.Double r0 = X.C90494aF.A0S()
            java.util.concurrent.atomic.AtomicReference r10 = new java.util.concurrent.atomic.AtomicReference
            r10.<init>(r0)
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference
            r6.<init>(r0)
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            X.63F r8 = new X.63F
            r8.<init>(r4, r0, r6, r10)
            X.4qL r5 = new X.4qL
            r5.<init>(r4, r10, r0, r6)
            X.5wp r12 = r4.A04
            X.5yT r6 = new X.5yT
            r0 = r18
            r6.<init>(r0, r7, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r19)
            X.A6S r0 = new X.A6S
            r0.<init>(r2)
            r6.A03 = r0
            java.lang.String r15 = r7.A07
            if (r15 == 0) goto L_0x0619
            X.5cX r2 = r4.A07
            X.5Tm r0 = X.C108435Tm.A0i
            java.util.List r13 = java.util.Collections.singletonList(r0)
            boolean r0 = com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils.forceSOLoad
            X.C36321k7.A0z(r13, r2)
            boolean r0 = com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils.forceSOLoad
            if (r0 != 0) goto L_0x05f6
            com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils.forceSOLoad = r19
        L_0x05f6:
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl r14 = new com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl
            r14.<init>(r2)
            int r0 = r13.size()
            int[] r10 = new int[r0]
            int r3 = r13.size()
            r2 = 0
        L_0x060a:
            if (r2 >= r3) goto L_0x0637
            java.lang.Object r0 = r13.get(r2)
            X.5Tm r0 = (X.C108435Tm) r0
            int r0 = r0.mCppValue
            r10[r2] = r0
            int r2 = r2 + 1
            goto L_0x060a
        L_0x0619:
            java.util.Objects.requireNonNull(r12)
            X.67q r3 = new X.67q
            r21 = r3
            r22 = r4
            r23 = r6
            r24 = r5
            r25 = r18
            r27 = r7
            r28 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            java.util.concurrent.Executor r2 = r12.A04
            r0 = 12
            X.C1503374w.A01(r12, r1, r3, r2, r0)
            goto L_0x0653
        L_0x0637:
            int[] r14 = com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils.filterNeededServicesNative(r15, r9, r10, r14)
            r10 = 0
            int r9 = r14.length
        L_0x063d:
            if (r10 < r9) goto L_0x06a8
            boolean r0 = X.C36411kG.A1a(r11)
            if (r0 != 0) goto L_0x0619
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            X.5hb r0 = new X.5hb
            r0.<init>(r2)
            r6.A01 = r0
            r0 = 1
            r6.A06 = r0
        L_0x0653:
            X.5vn r9 = r4.A03
            java.util.List r3 = r7.A09
            X.64V r21 = new X.64V
            r22 = r4
            r23 = r6
            r24 = r5
            r25 = r18
            r27 = r7
            r28 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            java.util.concurrent.Executor r2 = r9.A02
            X.753 r0 = new X.753
            r10 = r0
            r11 = r8
            r12 = r21
            r13 = r9
            r14 = r1
            r15 = r3
            r10.<init>((X.AnonymousClass63F) r11, (X.AnonymousClass64V) r12, (X.C123015vn) r13, (X.AnonymousClass6SG) r14, (java.util.List) r15)
            r2.execute(r0)
            r0 = 1
            X.7sQ r2 = new X.7sQ
            r2.<init>(r9, r0)
            X.6SG r1 = r6.A08
            X.6jm r8 = new X.6jm
            r9 = r4
            r10 = r6
            r11 = r5
            r12 = r18
            r13 = r26
            r14 = r7
            r15 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            java.util.List r11 = java.util.Collections.singletonList(r7)
            X.6Xw r0 = r4.A01
            r6 = r0
            r7 = r5
            r9 = r13
            r10 = r1
            X.6jj r1 = r6.A09(r7, r8, r9, r10, r11)
            X.6jk r3 = new X.6jk
            r0 = r20
            r3.<init>(r4, r1, r2, r0)
            java.util.Set r1 = r4.A08
            monitor-enter(r1)
            goto L_0x06ca
        L_0x06a8:
            r3 = r14[r10]
            java.util.Iterator r15 = r13.iterator()
        L_0x06ae:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x06c8
            java.lang.Object r2 = r15.next()
            r0 = r2
            X.5Tm r0 = (X.C108435Tm) r0
            int r0 = r0.mCppValue
            if (r0 != r3) goto L_0x06ae
        L_0x06bf:
            if (r2 == 0) goto L_0x06e0
            r11.add(r2)
            int r10 = r10 + 1
            goto L_0x063d
        L_0x06c8:
            r2 = 0
            goto L_0x06bf
        L_0x06ca:
            r1.add(r3)     // Catch:{ all -> 0x06dd }
            monitor-exit(r1)     // Catch:{ all -> 0x06dd }
            goto L_0x0481
        L_0x06d0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x06d5:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x06da:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x06dd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x06dd }
            throw r0
        L_0x06e0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r21)
            throw r0
        L_0x06e5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r21)
            throw r0
        L_0x06ea:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.avatar.data.PersonalizedAvatarRepository$loadEffect$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PersonalizedAvatarRepository$loadEffect$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
