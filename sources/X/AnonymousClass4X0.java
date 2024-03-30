package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import com.whatsapp.storage.StorageUsageMediaPreviewView;

/* renamed from: X.4X0  reason: invalid class name */
public class AnonymousClass4X0 implements AnonymousClass4U2 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass4X0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj4;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public void B1h() {
        ImageView imageView;
        int i;
        switch (this.A04) {
            case 0:
                imageView = (ImageView) this.A02;
                i = ((C41101wc) this.A03).A01.A02;
                break;
            case 1:
                imageView = ((C42701zF) this.A02).A02;
                i = ((GalleryPickerFragment) this.A03).A01;
                break;
            default:
                imageView = (ImageView) this.A03;
                Bitmap bitmap = StorageUsageMediaPreviewView.A0C;
                i = ((StorageUsageMediaPreviewView) this.A00).A07;
                break;
        }
        imageView.setBackgroundColor(i);
        imageView.setImageDrawable((Drawable) null);
    }

    public void Bi2(Bitmap bitmap, boolean z) {
        AnonymousClass2Ty r3;
        AnonymousClass2Ty r32;
        int i;
        AnonymousClass2Ty r33;
        AnonymousClass2Ty r34;
        AnonymousClass4V2 r7;
        int i2;
        Drawable drawable;
        Drawable drawable2;
        AnonymousClass2Ty r35;
        Drawable drawable3;
        AnonymousClass2bU r0;
        switch (this.A04) {
            case 0:
                AnonymousClass00C.A0D(bitmap, 0);
                MediaGalleryFragmentBase mediaGalleryFragmentBase = ((C41101wc) this.A03).A01;
                if (mediaGalleryFragmentBase.A0h() != null) {
                    AnonymousClass2Ty r36 = (AnonymousClass2Ty) this.A02;
                    if (r36.getTag() == this.A00) {
                        r7 = (AnonymousClass4V2) this.A01;
                        if (bitmap.equals(C56382wC.A00)) {
                            bitmap = null;
                        }
                        i2 = mediaGalleryFragmentBase.A02;
                        drawable = mediaGalleryFragmentBase.A05;
                        r35 = r36;
                        if (drawable == null) {
                            throw C36331k8.A0d("placeholderDrawable");
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 1:
                AnonymousClass00C.A0D(bitmap, 0);
                ImageView imageView = ((C42701zF) this.A02).A02;
                if (imageView.getTag() == this.A00) {
                    GalleryPickerFragment galleryPickerFragment = (GalleryPickerFragment) this.A03;
                    if (galleryPickerFragment.A0h() != null) {
                        if (bitmap.equals(C56382wC.A00)) {
                            C36441kJ.A1D(imageView);
                            imageView.setBackgroundColor(galleryPickerFragment.A01);
                            AnonymousClass4V2 r5 = (AnonymousClass4V2) this.A01;
                            if (r5 != null) {
                                int type = r5.getType();
                                if (Integer.valueOf(type) != null) {
                                    if (type == 0) {
                                        imageView.setBackgroundColor(galleryPickerFragment.A01);
                                        r33 = imageView;
                                        break;
                                    } else if (type == 1 || type == 2) {
                                        imageView.setBackgroundColor(galleryPickerFragment.A01);
                                        r34 = imageView;
                                        break;
                                    } else if (type == 3) {
                                        C36341k9.A0q(galleryPickerFragment.A0a(), imageView, R.color.f6nameremoved);
                                        i = R.drawable.gallery_audio_item;
                                        r32 = imageView;
                                        break;
                                    } else if (type == 4) {
                                        imageView.setBackgroundColor(galleryPickerFragment.A01);
                                        drawable2 = AnonymousClass3MS.A01(galleryPickerFragment.A0i(), r5.BEF(), (String) null, false);
                                    }
                                }
                            }
                            imageView.setBackgroundColor(galleryPickerFragment.A01);
                            imageView.setImageResource(0);
                            return;
                        }
                        C36411kG.A1D(imageView);
                        imageView.setBackgroundResource(0);
                        r3 = imageView;
                        if (!z) {
                            Drawable[] drawableArr = new Drawable[2];
                            drawableArr[0] = galleryPickerFragment.A03;
                            drawable2 = C36411kG.A0G(new BitmapDrawable(C36341k9.A0G(galleryPickerFragment), bitmap), drawableArr);
                        }
                        imageView.setImageDrawable(drawable2);
                        return;
                    }
                    return;
                }
                return;
            default:
                AnonymousClass2Ty r37 = (AnonymousClass2Ty) this.A03;
                if (r37.getTag() == this.A01) {
                    r7 = (C74833mF) this.A02;
                    if (bitmap == StorageUsageMediaPreviewView.A0C) {
                        bitmap = null;
                    }
                    StorageUsageMediaPreviewView storageUsageMediaPreviewView = (StorageUsageMediaPreviewView) this.A00;
                    i2 = storageUsageMediaPreviewView.A07;
                    drawable = storageUsageMediaPreviewView.A08;
                    r35 = r37;
                    break;
                } else {
                    return;
                }
        }
        boolean z2 = !z;
        Context context = r35.getContext();
        if (bitmap == null) {
            r35.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int type2 = r7.getType();
            if (type2 == 0) {
                r35.setBackgroundColor(i2);
                r33 = r35;
                i = R.drawable.ic_missing_thumbnail_picture;
                r32 = r33;
                r32.setImageResource(i);
                return;
            } else if (type2 == 1 || type2 == 2) {
                r35.setBackgroundColor(i2);
                r34 = r35;
                i = R.drawable.ic_missing_thumbnail_video;
                r32 = r34;
                r32.setImageResource(i);
                return;
            } else if (type2 == 3) {
                AnonymousClass4V2 r1 = r35.A08;
                if (!(r1 instanceof C74833mF) || (r0 = ((C74833mF) r1).A02) == null || r0.A09 != 1) {
                    C36341k9.A0q(context, r35, R.color.f6nameremoved);
                    i = R.drawable.icon_audio_large;
                    r32 = r35;
                } else {
                    C36341k9.A0q(context, r35, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
                    i = R.drawable.icon_ppt_large;
                    r32 = r35;
                }
                r32.setImageResource(i);
                return;
            } else if (type2 != 4) {
                r35.setBackgroundColor(i2);
                r35.setImageResource(0);
                return;
            } else {
                r35.setBackgroundColor(i2);
                drawable3 = AnonymousClass3MS.A01(context, r7.BEF(), (String) null, true);
            }
        } else {
            C36411kG.A1D(r35);
            r35.setBackgroundColor(0);
            r35.A06 = bitmap;
            r3 = r35;
            if (z2) {
                Drawable[] drawableArr2 = new Drawable[2];
                drawableArr2[0] = drawable;
                drawable3 = C36411kG.A0G(C36421kH.A0C(context, bitmap), drawableArr2);
            }
            r3.setImageBitmap(bitmap);
            return;
        }
        r35.setImageDrawable(drawable3);
    }

    public /* synthetic */ void BXH() {
    }
}
