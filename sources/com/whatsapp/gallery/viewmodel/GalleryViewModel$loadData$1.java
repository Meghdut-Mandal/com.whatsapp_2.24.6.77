package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1S3;
import X.AnonymousClass2U7;
import X.AnonymousClass3T1;
import X.C005502l;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C02680Bk;
import X.C109325Xd;
import X.C145646uI;
import X.C1512778x;
import X.C224214g;
import X.C36321k7;
import X.C36331k8;
import X.C36691l9;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.gallery.viewmodel.GalleryViewModel$loadData$1", f = "GalleryViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
public final class GalleryViewModel$loadData$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $approxScreenItemCount;
    public final /* synthetic */ C006302t $cursorCallback;
    public final /* synthetic */ AnonymousClass1S3 $ftsQuery;
    public final /* synthetic */ String $logName;
    public final /* synthetic */ List $timeBuckets;
    public final /* synthetic */ C145646uI $timeBucketsProvider;
    public int label;
    public final /* synthetic */ GalleryViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.gallery.viewmodel.GalleryViewModel$loadData$1$1", f = "GalleryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.gallery.viewmodel.GalleryViewModel$loadData$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r11) {
            GalleryViewModel galleryViewModel = galleryViewModel;
            String str = str;
            C006302t r7 = r10;
            List list = list;
            return new AnonymousClass1(r4, galleryViewModel, r6, str, list, r11, r7, i2);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass3T1 r0;
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                GalleryViewModel galleryViewModel = galleryViewModel;
                galleryViewModel.A00 = new C02680Bk();
                try {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append(str);
                    C224214g r2 = new C224214g(AnonymousClass000.A0q("/getCursor", A0u));
                    Cursor cursor = (Cursor) r10.invoke(galleryViewModel.A00);
                    r2.A01();
                    int count = cursor.getCount();
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("GalleryViewModel/");
                    A0u2.append(str);
                    C36321k7.A1T("/loadInBackground/", A0u2, count);
                    list.clear();
                    C1512778x r3 = null;
                    if (cursor.moveToFirst()) {
                        int i = 0;
                        do {
                            GalleryViewModel galleryViewModel2 = galleryViewModel;
                            if (cursor instanceof C36691l9) {
                                r0 = ((C36691l9) cursor).A02();
                            } else {
                                r0 = galleryViewModel2.A05.A00(cursor);
                            }
                            if (r0 == null) {
                                break;
                            }
                            C1512778x A00 = r4.A00(r0.A0I);
                            if (r3 == null || !r3.equals(A00)) {
                                if (r3 != null) {
                                    list.add(r3);
                                }
                                A00.bucketCount = 0;
                                r3 = A00;
                            }
                            r3.bucketCount++;
                            i++;
                            if (!cursor.moveToNext()) {
                                break;
                            }
                        } while (i >= i2);
                    }
                    if (r3 != null) {
                        list.add(r3);
                    }
                    GalleryViewModel galleryViewModel3 = galleryViewModel;
                    C36331k8.A1T(new GalleryViewModel$notifyOnMainThread$1(galleryViewModel3, new AnonymousClass2U7(cursor, r6, count), (C023509x) null), C109325Xd.A00(galleryViewModel3));
                } catch (CancellationException e) {
                    Log.e("GalleryViewModel/CancellationException/error", e);
                }
                return AnonymousClass0AJ.A00;
            }
            throw AnonymousClass000.A0e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryViewModel$loadData$1(C145646uI r2, GalleryViewModel galleryViewModel, AnonymousClass1S3 r4, String str, List list, C023509x r7, C006302t r8, int i) {
        super(2, r7);
        this.this$0 = galleryViewModel;
        this.$logName = str;
        this.$cursorCallback = r8;
        this.$timeBuckets = list;
        this.$timeBucketsProvider = r2;
        this.$approxScreenItemCount = i;
        this.$ftsQuery = r4;
    }

    public final C023509x create(Object obj, C023509x r11) {
        GalleryViewModel galleryViewModel = this.this$0;
        String str = this.$logName;
        C006302t r7 = this.$cursorCallback;
        List list = this.$timeBuckets;
        return new GalleryViewModel$loadData$1(this.$timeBucketsProvider, galleryViewModel, this.$ftsQuery, str, list, r11, r7, this.$approxScreenItemCount);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final GalleryViewModel galleryViewModel = this.this$0;
            C005502l r0 = galleryViewModel.A06;
            final String str = this.$logName;
            final C006302t r10 = this.$cursorCallback;
            final List list = this.$timeBuckets;
            final C145646uI r4 = this.$timeBucketsProvider;
            final int i2 = this.$approxScreenItemCount;
            final AnonymousClass1S3 r6 = this.$ftsQuery;
            AnonymousClass1 r3 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r0, r3) == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GalleryViewModel$loadData$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
