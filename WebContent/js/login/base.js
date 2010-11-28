(function(e){
    e.fn.passwordStrength=function(m){
        m=e(m).css({
            "font-size":"10px",background:"transparent","border-bottom":"3px solid"
        }
        );
        var k=function(u,v){
            return v.indexOf(u)>-1
        };
return this.blur(function(){
    var u=bn=bu=bl=bp=0,v=e(this).val();
    if(v.length<6)u=0;
    else{
        if(v.length>9)u=1;
        for(i=0;i<v.length;i++){
            var w=v.charAt(i);
            if(!bn&&k(w,"0123456789"))bn=1;
            if(!bu&&k(w,"ABCDEFGHIJKLMNOPQRSTUVWXYZ"))bu=1;
            if(!bl&&k(w,"abcdefghijklmnopqrstuvwxyz"))bl=1;
            if(!bp&&k(w,"`~!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?"))bp=
            1
        }
        u+=bn+bu+bl+bp
    }
    if(u<1)m.text("Too short, min 6 characters.").show().css({
        color:"#aaa"
    }
    );
    else if(u===1)m.text("Password strength: Weak").show().css({
        color:"red"
    }
    );
    else if(u===2)m.text("Password strength: Fair").show().css({
        color:"orange"
    }
    );
    else u===3?m.text("Password strength: Good").show().css({
        color:"#3e87dd"
    }
    ):m.text("Password strength: Strong").show().css({
        color:"green"
    }
    )
}
)
};
e.fn.passwordMatch=function(m){
m=e(m);
msg=m.parent().find(".msg").css({
    "font-size":"11px"
}
);
var k=this,u=function(){
    if(k.val())if(m.val()!=
    k.val()){
        msg.text("Password don't match.").css({
            color:"red"
        }
        ).show();
        m.addClass("error")
    }
    else{
        msg.text("Password matched.").css({
            color:"green"
        }
        ).show();
        m.removeClass("error")
    }
};
m.blur(function(){
    u()
}
);
k.blur(function(){
    m.val()&&u()
}
);
return this
}
}
)(jQuery);
function locationSearch2JSON(){
    var e=window.location.search.substring(1).split("&"),m={
    };
    for(i=0;i<e.length;i++){
        var k=e[i].indexOf("=");
        m[e[i].substring(0,k)]=e[i].substring(k+1)
    }
    return m
}
function MD5(e){
function m(g,h){
    return g<<h|g>>>32-h
}
function k(g,h){
    var j,l,n,o;
    n=g&2147483648;
    o=h&2147483648;
    j=g&1073741824;
    l=h&1073741824;
    g=(g&1073741823)+(h&1073741823);
    if(j&l)return g^2147483648^n^o;
    return j|l?g&1073741824?g^3221225472^n^o:g^1073741824^n^o:g^n^o
}
function u(g,h,j){
    return g&h|~g&j
}
function v(g,h,j){
    return g&j|h&~j
}
function w(g,h,j){
    return g^h^j
}
function C(g,h,j){
    return h^(g|~j)
}
function q(g,h,j,l,n,o,p){
    g=k(g,k(k(u(h,j,l),n),p));
    return k(m(g,o),h)
}
function r(g,h,j,l,n,o,p){
    g=k(g,
    k(k(v(h,j,l),n),p));
    return k(m(g,o),h)
}
function s(g,h,j,l,n,o,p){
    g=k(g,k(k(w(h,j,l),n),p));
    return k(m(g,o),h)
}
function t(g,h,j,l,n,o,p){
    g=k(g,k(k(C(h,j,l),n),p));
    return k(m(g,o),h)
}
function D(g){
    var h,j=g.length;
    h=j+8;
    for(var l=((h-h%64)/64+1)*16,n=Array(l-1),o=0,p=0;p<j;){
        h=(p-p%4)/4;
        o=p%4*8;
        n[h]|=g.charCodeAt(p)<<o;
        p++
    }
    h=(p-p%4)/4;
    o=p%4*8;
    n[h]|=128<<o;
    n[l-2]=j<<3;
    n[l-1]=j>>>29;
    return n
}
function x(g){
    var h="",j="",l;
    for(l=0;l<=3;l++){
        j=g>>>l*8&255;
        j="0"+j.toString(16);
        h+=j.substr(j.length-2,2)
    }
    return h
}
function E(g){
    g=g.replace(/\r\n/g,"\n");
    for(var h="",j=0;j<g.length;j++){
        var l=g.charCodeAt(j);
        if(l<128)h+=String.fromCharCode(l);
        else{
            if(l>127&&l<2048)h+=String.fromCharCode(l>>6|192);
            else{
                h+=String.fromCharCode(l>>12|224);
                h+=String.fromCharCode(l>>6&63|128)
            }
            h+=String.fromCharCode(l&63|128)
        }
    }
    return h
}
var f=Array(),y,z,A,B,a,b,c,d;
e=E(e);
f=D(e);
a=1732584193;
b=4023233417;
c=2562383102;
d=271733878;
for(e=0;e<f.length;e+=16){
    y=a;
    z=b;
    A=c;
    B=d;
    a=q(a,b,c,d,f[e+0],7,3614090360);
    d=q(d,a,b,c,f[e+1],12,3905402710);
    c=q(c,d,a,b,f[e+2],17,606105819);
    b=q(b,c,d,a,f[e+3],22,3250441966);
    a=q(a,b,c,d,f[e+4],7,4118548399);
    d=q(d,a,b,c,f[e+5],12,1200080426);
    c=q(c,d,a,b,f[e+6],17,2821735955);
    b=q(b,c,d,a,f[e+7],22,4249261313);
    a=q(a,b,c,d,f[e+8],7,1770035416);
    d=q(d,a,b,c,f[e+9],12,2336552879);
    c=q(c,d,a,b,f[e+10],17,4294925233);
    b=q(b,c,d,a,f[e+11],22,2304563134);
    a=q(a,b,c,d,f[e+12],7,1804603682);
    d=q(d,a,b,c,f[e+13],12,4254626195);
    c=q(c,d,a,b,f[e+14],17,2792965006);
    b=q(b,c,d,a,f[e+15],22,1236535329);
    a=r(a,b,c,d,f[e+1],5,4129170786);
    d=r(d,a,b,c,f[e+6],9,3225465664);
    c=r(c,d,a,b,f[e+11],14,643717713);
    b=r(b,c,d,a,f[e+0],20,3921069994);
    a=r(a,b,c,d,f[e+5],5,3593408605);
    d=r(d,a,b,c,f[e+10],9,38016083);
    c=r(c,d,a,b,f[e+15],14,3634488961);
    b=r(b,c,d,a,f[e+4],20,3889429448);
    a=r(a,b,c,d,f[e+9],5,568446438);
    d=r(d,a,b,c,f[e+14],9,3275163606);
    c=r(c,d,a,b,f[e+3],14,4107603335);
    b=r(b,c,d,a,f[e+8],20,1163531501);
    a=r(a,b,c,d,f[e+13],5,2850285829);
    d=r(d,a,b,c,f[e+2],9,4243563512);
    c=r(c,d,a,b,f[e+7],14,1735328473);
    b=r(b,c,d,a,f[e+12],20,2368359562);
    a=s(a,b,c,d,f[e+5],4,4294588738);
    d=s(d,a,b,c,f[e+8],11,2272392833);
    c=s(c,d,a,b,f[e+11],16,1839030562);
    b=s(b,c,d,a,f[e+14],23,4259657740);
    a=s(a,b,c,d,f[e+1],4,2763975236);
    d=s(d,a,b,c,f[e+4],11,1272893353);
    c=s(c,d,a,b,f[e+7],16,4139469664);
    b=s(b,c,d,a,f[e+10],23,3200236656);
    a=s(a,b,c,d,f[e+13],4,681279174);
    d=s(d,a,b,c,f[e+0],11,3936430074);
    c=s(c,d,a,b,f[e+3],16,3572445317);
    b=s(b,c,d,a,f[e+6],23,76029189);
    a=s(a,b,c,d,f[e+9],4,3654602809);
    d=s(d,a,b,c,f[e+12],11,3873151461);
    c=s(c,d,a,b,f[e+15],16,530742520);
    b=s(b,c,d,a,f[e+2],23,3299628645);
    a=t(a,b,c,d,f[e+0],6,4096336452);
    d=t(d,a,b,c,f[e+7],10,1126891415);
    c=t(c,d,a,b,f[e+14],15,2878612391);
    b=t(b,c,d,a,f[e+5],21,4237533241);
    a=t(a,b,c,d,f[e+12],6,1700485571);
    d=t(d,a,b,c,f[e+3],10,2399980690);
    c=t(c,d,a,b,f[e+10],15,4293915773);
    b=t(b,c,d,a,f[e+1],21,2240044497);
    a=t(a,b,c,d,f[e+8],6,1873313359);
    d=t(d,a,b,c,f[e+15],10,4264355552);
    c=t(c,d,a,b,f[e+6],15,2734768916);
    b=t(b,c,d,a,f[e+13],21,1309151649);
    a=t(a,b,c,d,f[e+4],6,4149444226);
    d=t(d,a,b,c,f[e+11],10,3174756917);
    c=t(c,d,a,b,f[e+2],15,718787259);
    b=t(b,c,d,a,f[e+9],21,3951481745);
    a=k(a,y);
    b=k(b,z);
    c=k(c,A);
    d=k(d,B)
}
return(x(a)+x(b)+x(c)+x(d)).toLowerCase()
};
