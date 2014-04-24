package com.bumptech.glide.resize;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import com.bumptech.glide.Glide;
import com.bumptech.glide.loader.bitmap.BitmapLoadFactory;
import com.bumptech.glide.presenter.target.Target;

/**
 * A simple builder class for {@link BitmapRequest}.
 *
 * @param <T> The model type the {@link BitmapRequest} will load a {@link Bitmap} from.
 */
public class BitmapRequestBuilder<T> {
    T model;
    BitmapLoadFactory<T> bitmapLoadFactory;
    ImageManager imageManager;
    Target target;
    Priority priority;
    float sizeMultiplier;
    Drawable placeholderDrawable;
    Drawable errorDrawable;
    Glide.RequestListener<T> requestListener;
    Animation animation;
    int placeholderResourceId;
    int errorResourceId;
    Context context;
    RequestCoordinator requestCoordinator;
    int animationId;

    public BitmapRequestBuilder<T> setModel(T model) {
        this.model = model;
        return this;
    }

    public BitmapRequestBuilder<T> setContext(Context context) {
        this.context = context;
        return this;
    }

    public BitmapRequestBuilder<T> setBitmapLoadFactory(BitmapLoadFactory<T> bitmapLoadFactory) {
        this.bitmapLoadFactory = bitmapLoadFactory;
        return this;
    }

    public BitmapRequestBuilder<T> setImageManager(ImageManager imageManager) {
        this.imageManager = imageManager;
        return this;
    }

    public BitmapRequestBuilder<T> setTarget(Target target) {
        this.target = target;
        return this;
    }

    public BitmapRequestBuilder<T> setPriority(Priority priority) {
        this.priority = priority;
        return this;
    }

    public BitmapRequestBuilder<T> setSizeMultiplier(float sizeMultiplier) {
        this.sizeMultiplier = sizeMultiplier;
        return this;
    }

    public BitmapRequestBuilder<T> setRequestListener(Glide.RequestListener<T> requestListener) {
        this.requestListener = requestListener;
        return this;
    }

    public BitmapRequestBuilder<T> setAnimation(int animationId) {
        this.animationId = animationId;
        return this;
    }

    public BitmapRequestBuilder<T> setAnimation(Animation animation) {
        this.animation = animation;
        return this;
    }

    public BitmapRequestBuilder<T> setPlaceholderResource(int resourceId) {
        this.placeholderResourceId = resourceId;
        return this;
    }

    public BitmapRequestBuilder<T> setPlaceholderDrawable(Drawable placeholderDrawable) {
        this.placeholderDrawable = placeholderDrawable;
        return this;
    }

    public BitmapRequestBuilder<T> setErrorResource(int resourceId) {
        this.errorResourceId = resourceId;
        return this;
    }

    public BitmapRequestBuilder<T> setErrorDrawable(Drawable errorDrawable) {
        this.errorDrawable = errorDrawable;
        return this;
    }

    public BitmapRequestBuilder<T> setRequestCoordinator(RequestCoordinator requestCoordinator) {
        this.requestCoordinator = requestCoordinator;
        return this;
    }

    public BitmapRequest<T> build() {
        return new BitmapRequest<T>(this);
    }
}