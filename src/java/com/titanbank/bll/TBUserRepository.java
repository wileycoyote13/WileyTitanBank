
package com.titanbank.bll;

import java.util.ArrayList;

/**
 *
 * @author w_coyote13
 */
public interface TBUserRepository 
{
    User findByUserName(String userName);
}
