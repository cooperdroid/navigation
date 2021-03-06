package library.navigation.interfaces;

import android.support.v4.app.Fragment;

@SuppressWarnings("unused")
public interface OnActionNavigation {

    void onBackPressedNavigation();
    void goDown(Fragment fragment, boolean stack);
    void goDownInverse(Fragment fragment, boolean stack);
    void goUp();
    //void goToSection (Fragment fragment, boolean stack);
    void goToSection (Fragment fragment);
    void goToSectionInverse (Fragment fragment);

}
