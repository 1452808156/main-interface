
const path = {
    regPath: "reg"    // 统一  如果需要修改 改一次 到处都受到影响
}
window.onload = function () {
    document.getElementById("phone").onblur = function (){
        let uphonespan = document.getElementById("uphonespan");
        let uvalue = this.value;
        if(uvalue.length != 11) {
            uphonespan.innerHTML = "手机号长度不合法！";
        }
        else {
            uphonespan.innerHTML = "";
        }
    }
    document.getElementById("pass").onblur = function () {
        let password = this.value;
        let paspan = document.getElementById("passspan");
        if(password.length <= 5 || password.length >= 12) {
            paspan.innerHTML = "密码长度应在6-11位！"
        }
        else {
            paspan.innerHTML = "";
        }
    }
    document.getElementById("repass").onblur = function () {
        let password = document.getElementById("pass").value;
        let repassword = document.getElementById("repass").value;
        let respan = document.getElementById("respan");
        if(password != repassword) {
            respan.innerHTML = "两次输入密码不一致！";
        }
        else {
            respan.innerHTML = "";
        }
    }
    document.getElementById("nick").onblur = function () {
        let nickname = document.getElementById("nick").value;
        let nickspan = document.getElementById("nickspan");
        if (nickname.length >= 12) {
            nickspan.innerHTML = "昵称应不超过12位！"
        } else if(nickname.length == 0){
            nickspan.innerHTML = "昵称不能为空!"
        }
        else {
            nickspan.innerHTML = "";
        }
    }
}

let validate = new Vue({
    el:".reg-form",
    data:{
        phone:"",
        passcode:"",
        nick:"",
        gender: "" //1为男性, 2为女性
    },
    methods:{
        validate:function(event){
            event.target.innerHTML = "Registing ...." ;
            let varphone = document.getElementById("phone").value;
            let varpass = document.getElementById("pass").value;
            let varrepass = document.getElementById("repass").value;
            let varnick = document.getElementById("nick").value;
            if(varphone == "" || varpass == "" || varrepass == "" || varnick == "" || this.gender == "") {
                alert("输入的信息不能为空！");
                location.reload();
                return;
            }
            else if(varphone.length != 11){
                alert("手机号长度出错！");
                location.reload();
                return;
            }
            else if(varpass.length >= 11 || varpass.length <= 5) {
                alert("密码不合法！");
                location.reload();
                return;
            } else if(varrepass != varpass) {
                alert("两次密码输入不一致！");
                location.reload();
                return;
            } else if(varnick.length >= 12) {
                alert("昵称不能超过12位！");
                location.reload();
                return;
            }
            // alert("操作正确");
            // 组装数据
            axios({
                    url: path.regPath,
                    method: "post",
                    data: this.$data     // json 数据
                }
            ).then(resp =>{

                if(resp.data == "OK"){
                    alert("注册成功");
                    event.target.innerHTML = "Regist Success";
                    event.target.innerHTML = ""
                    setTimeout(function(){
                        window.location.href = "index.html";
                    }, 1000);

                }
                else if(resp.data=="UsedP"){
                    alert("重复手机号");
                    event.target.innerHTML = "Go fuck yourself, used PhoneNum, RUsb?";
                }
                else{
                    event.target.innerHTML = "Regist Failed, unknown question, I'm fucked up.";
                }
            });
        }
    }
});

