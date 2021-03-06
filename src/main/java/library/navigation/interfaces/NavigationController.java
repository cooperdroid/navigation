package library.navigation.interfaces;

import android.support.v4.app.Fragment;

@SuppressWarnings("unused")
public interface NavigationController {

    //void navigateToSection(Fragment fragment, boolean addToBackStack) throws Exception;

    void navigateToSection(Fragment fragment) throws Exception;

    void navigateToSectionInverse(Fragment fragment) throws Exception;

    void navigateDown(Fragment fragment, boolean addToBackStack) throws Exception;

    void navigateDownInverse(Fragment fragment, boolean addToBackStack) throws Exception;

    void navigateUp() throws Exception;

    void navigateUp(int levels) throws Exception;
}
