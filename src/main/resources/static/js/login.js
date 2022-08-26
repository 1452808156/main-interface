
let login = new Vue({
    el:".container",
    data:{

        phone1: "",
        password1:"",

        text:"登录"
    },
    methods:{
        login:function (event){

            // this.text="登陆";
            let param = new URLSearchParams();
            param.append("phone1", this.$data.phone1);
            param.append("password1", this.$data.password1);
            this.text = "登录中。。。";

            // axios
            axios({
                url: "login",//地址！！！
                method:"post",
                data: param,
            }).then(resp => {
                switch (parseInt(resp.data)) {
                    case 200:
                        this.text = "登录成功";
                        setTimeout(function(){
                            window.location.href = "index.html";
                        },1000);
                        //接下来是通过session获取用户信息

                        break;
                    case 201:
                        alert("手机号不正确");
                        this.text = "登录失败"
                        event.target.innerHTML = "Fuck you, RUsb? Your PhoneNum?";
                        document.getElementById("btn1").style.backgroundColor = "red";
                        break;
                    case 202:
                        alert("密码不正确");
                        this.text = "登录失败"
                        event.target.innerHTML = "Fuck you, RUsb? Your Password?";
                        document.getElementById("btn1").style.backgroundColor = "red";
                        break;
                    case 500:
                        alert("服务器错误，请稍后重试...");
                        this.text = "登录失败"
                        event.target.innerHTML = "I'm really fucked up.";
                        document.getElementById("btn1").style.backgroundColor = "red";
                        break;
                }
            });


        }

    }
});


