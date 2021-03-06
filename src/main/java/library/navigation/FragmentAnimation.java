package library.navigation;

/**
 * Encapsulates an object to pass some animations to the {@link NavigationManager NavigationManager}
 * and ultimely Android's FragmentManager to add some eye candy to the transitions.
 * <p/>
 * The FragmentAnimation class accepts only R.animator ids from android.R classes.
 */
@SuppressWarnings("unused")
public class FragmentAnimation {

    /**
     * Constant for no animation with short duration
     */
    public static final int NO_ANIMATION = 0;
    /**
     * Animation for when the Fragment is loaded
     */
    protected int enterAnim = NO_ANIMATION;
    /**
     * Animation for when the fragment is removed
     */
    protected int exitAnim = NO_ANIMATION;
    /**
     * Animation for when the fragment is pushed into the stack
     */
    protected int pushInAnim = NO_ANIMATION;
    /**
     * Animation for when the fragment is popped from the stack
     */
    protected int popOutAnim = NO_ANIMATION;
    /**
     * Disappearing View for Lollipop Animations
     */
    protected LollipopAnim[] sharedViews;

    /**
     * Creates a partially completed fragment animation, only with enter and exit animation
     *
     * @param enterAnim Enter animaition
     * @param exitAnim  Exit animation
     */
    public FragmentAnimation(int enterAnim, int exitAnim) {
        this.enterAnim = enterAnim;
        this.exitAnim = exitAnim;
        this.sharedViews = new LollipopAnim[0];
    }

    /**
     * Creates a partially completed fragment animation, only with enter and exit animation plus Lollipop Animations
     *
     * @param enterAnim   Enter animaition
     * @param exitAnim    Exit animation
     * @param sharedViews Array with necessary elements to build one or several Lollipop animations
     */
    public FragmentAnimation(int enterAnim, int exitAnim, LollipopAnim[] sharedViews) {
        this.enterAnim = enterAnim;
        this.exitAnim = exitAnim;
        this.sharedViews = sharedViews;
    }

    /**
     * Creates a fully completed fragment animation, with all the required animations (enter, exit, pop out of the stack
     * and push into the stack
     *
     * @param enterAnim  Enter animaition
     * @param exitAnim   Exit animation
     * @param pushInAnim Pop in animation
     * @param popOutAnim Pop out animation
     */
    public FragmentAnimation(int enterAnim, int exitAnim, int pushInAnim, int popOutAnim) {
        this(enterAnim, exitAnim);
        this.pushInAnim = pushInAnim;
        this.popOutAnim = popOutAnim;
        this.sharedViews = new LollipopAnim[0];
    }

    /**
     * Creates a fully completed fragment animation, with all the required animations (enter, exit, pop out of the stack
     * and push into the stack
     *
     * @param enterAnim   Enter animaition
     * @param exitAnim    Exit animation
     * @param pushInAnim  Pop in animation
     * @param popOutAnim  Pop out animation
     * @param sharedViews Array with necessary elements to build one or several Lollipop animations.
     */
    public FragmentAnimation(int enterAnim, int exitAnim, int pushInAnim, int popOutAnim, LollipopAnim[] sharedViews) {
        this.enterAnim = enterAnim;
        this.exitAnim = exitAnim;
        this.pushInAnim = pushInAnim;
        this.popOutAnim = popOutAnim;
        this.sharedViews = sharedViews;
    }

    /**
     * Retrieves the enter animation
     *
     * @return R.animator ID of enter animation
     */
    public int getEnterAnim() {
        return enterAnim;
    }

    /**
     * Retrieves the exit animation
     *
     * @return R.animator ID of exit animation
     */
    public int getExitAnim() {
        return exitAnim;
    }

    /**
     * Retrieves the push in animation
     *
     * @return R.animator ID of push in animation
     */
    public int getPushInAnim() {
        return pushInAnim;
    }

    /**
     * Retrieves the pop out animation
     *
     * @return R.animator ID of pop out animation
     */
    public int getPopOutAnim() {
        return popOutAnim;
    }

    /**
     * Return if the animation covers the four possible animations:
     * <ul>
     * <li>New Fragment being shown</li>
     * <li>Old Fragment being stored to the backstack</li>
     * <li>New Fragment being being removed</li>
     * <li>Old Fragment being popped</li>
     * <p/>
     * </ul>
     *
     * @return TRUE if any of the pop out animation of the push in animation are defined, FALSE otherwise
     */
    public boolean isCompletedAnimation() {
        return popOutAnim != NO_ANIMATION || pushInAnim != NO_ANIMATION;
    }

    public LollipopAnim[] getSharedViews() {
        return sharedViews;
    }
}
