package com.example.mvpdemo;

import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

/**
 * @TODO:
 * @Date: 2021/2/7 15:36
 * @User: lay
 */
@GlideModule
public class MvxDemoGlideModule extends AppGlideModule {
    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }
}
