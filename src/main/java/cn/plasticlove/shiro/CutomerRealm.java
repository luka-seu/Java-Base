package cn.plasticlove.shiro;




import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;


public class CutomerRealm extends AuthorizingRealm {

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
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // String channelId = (String) authenticationToken.getPrincipal();
        // String password = tChannelAgentMapper.selectPasswordBychannelId(channelId);
        // if (password == null) {
        //     return null;
        // }
        //
        // SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(channelId, password, "customRealm");
        //
        //
        //
        // return authenticationInfo;
        return null;

    }

    public static void main(String[] args) {
        Md5Hash md5Hash = new Md5Hash("jd666");
        System.out.println(md5Hash.toString());
    }
}
