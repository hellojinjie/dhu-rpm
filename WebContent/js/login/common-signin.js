(function(c){
function f(b){
    b!=="hide"?g.show().text(b):g.hide().text("")
}
function j(){
e.find("input.required").each(function(){
    var b=c(this);
    b.val()||f(b.prev("h2").text()+" is reqired.")
}
)
}
var e=c("#common_signin_form"),g=c("#form_error"),i=e.find(".waiting"),k=e.find("input[name=account]").focus(),l=e.find("input[name=user]"),m=e.find("input[name=password]");
e.submit(function(){
    f("hide");
    j();
    if(!g.is(":visible")){
        var b=c.trim(k.val()).toLowerCase();
        i.show();
        c.ajax({
            url:"/api/v1/g/json/sign-in/",
            type:"POST",data:c.param({
                account:b,key:MD5(m.val()+"taskant"),user:l.val(),tzo:(new Date).getTimezoneOffset()
            }
            ),success:function(a){
                var d="/"+a.account+"/";
                document.cookie="T="+a.token+"; path="+d;
                document.cookie="ID="+a.id+"; path="+d;
                window.location.href=d
            }
            ,error:function(a){
                var d=a.status;
                a=c.parseJSON(a.responseText);
                if(d==400){
                    var h;
                    if(a.invalid&&a.invalid.key)h="Your password is incorrect, please try again.";
                    else if(a.invalid&&a.invalid.user)h="Username or email is invalid.";
                    f(h)
                }
                else d==404?
                f("Username or email can't find in the account \""+b+'"'):f("Sorry, we got a problem("+d+"), please try again later")
            }
            ,complete:function(){
                i.hide()
            }
        }
        )
    }
    return false
}
)
}
)(jQuery);
