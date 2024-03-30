package X;

import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.0zJ  reason: invalid class name and case insensitive filesystem */
public class C21480zJ implements C21470zI {
    public void B11(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: annotationKeyTooLong for marker: ");
        sb.append(i);
        sb.append(" (");
        sb.append(str);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void B12(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: annotationMisuse ");
        sb.append(i);
        sb.append(" : ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void B13(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: annotationSizeLimitExceeded for marker: ");
        sb.append(i);
        sb.append(" (");
        sb.append(str);
        sb.append(": ");
        sb.append(i2);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void B1g() {
        Log.e("QPL: backgroundListenerEventsFull");
    }

    public void B6l(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: errorCompressingFile: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void B6m(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: errorDeletingFile: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void B6n(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: errorParsingConfig: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void B6o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: errorUploadingFile: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void B6p(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: errorWritingToFile: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void B6w(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: eventBuilderRepeatedSubmit ");
        sb.append(i);
        Log.e(sb.toString());
    }

    public void BKG(int i, String str, double d) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: illegalDoubleAnnotation for marker: ");
        sb.append(i);
        sb.append(" (");
        sb.append(str);
        sb.append(": ");
        sb.append(d);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void BNs(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: jsonFormatError for marker: ");
        sb.append(i);
        sb.append(" msg: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void BPT() {
        Log.e("QPL: maxFileCountReached");
    }

    public void BPV(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: maxMarkerCountExceeded for marker: ");
        sb.append(i);
        Log.e(sb.toString());
    }

    public void BPW(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: maxPointCountExceeded for marker: ");
        sb.append(i);
        Log.e(sb.toString());
    }

    public void BQF(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: noPointName ");
        sb.append(i);
        Log.e(sb.toString());
    }

    public void Blf(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: pointDataTooLong for marker: ");
        sb.append(i);
        sb.append(" (");
        sb.append(str);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void Blg(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: pointNameTooLong for marker: ");
        sb.append(i);
        sb.append(" (");
        sb.append(str);
        sb.append(")");
        Log.e(sb.toString());
    }

    public void Blh(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: pointToEndAtNotFound for marker: ");
        sb.append(i);
        sb.append(" and pointName: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void BoH(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: reportWarning ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void Bvx(Collection collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("QPL: tooManyOpenMarkersToWrite: ");
        sb.append(collection);
        Log.e(sb.toString());
    }

    public void BwI() {
        Log.e("QPL: unfinishedListenerEventRemaining");
    }
}
