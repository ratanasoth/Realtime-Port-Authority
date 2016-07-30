package rectangledbmi.com.pittsburghrealtimetracker.polylines;

import rx.Observer;

/**
 * <p>MVVM View that handles the UI State of Polylines.</p>
 * <p>Created by epicstar on 7/29/16.</p>
 * @since 76
 * @author Jeremy Jao and Michael Antonacci
 */
public interface PolylineView {
    /**
     * Creates a an {@link Observer} for {@link com.google.android.gms.maps.model.Polyline} creation
     * info from the {@link PolylineViewModel}.
     * @return an Observer for {@link com.google.android.gms.maps.model.Polyline} creation.
     */
    Observer<PatternSelection> polylineObserver();
}
