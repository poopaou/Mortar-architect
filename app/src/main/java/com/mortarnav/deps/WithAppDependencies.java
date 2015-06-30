package com.mortarnav.deps;

/**
 * @author Lukasz Piliszczuk - lukasz.pili@gmail.com
 */
public interface WithAppDependencies {

    RestClient restClient();

    UserManager userManager();
}
