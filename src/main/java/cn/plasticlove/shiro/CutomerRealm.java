package cn.plasticlove.shiro;

import cn.plasticlove.dao.UserMapper;
import cn.plasticlove.entity.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import sun.security.util.Password;


/**
 * The type Cutomer realm.
 */
public class CutomerRealm extends AuthorizingRealm {


    @Autowired
    private UserMapper userMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        /*String username = (String) principalCollection.getPrimaryPrincipal();
        Set<String> roleSet = tChannelChannelDao.queryRoleBychannelId(username);
        Set<String> permissionSet = tChannelChannelDao.queryPermissionBychannelId(username);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(roleSet);
        authorizationInfo.setStringPermissions(permissionSet);
        return authorizationInfo;*/



        return null;
    }

    @Override
    /**
     * Authenticator
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //the account identity
        String username = (String) authenticationToken.getPrincipal();
        //get password
        User user = userMapper.selectByUsername(username);


        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, user.getPassword(), "customRealm");
        //the salt of md5
        authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes("luka-seu"));

        return authenticationInfo;

    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Md5Hash md5Hash = new Md5Hash("123456","luka-seu");
        System.out.println(md5Hash.toString());
    }
}
