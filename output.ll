declare i32 @printf(i8*, ...)
declare i32 @sprintf(i8*, i8*, ...)
declare i8* @strcpy(i8*, i8*)
declare i8* @strcat(i8*, i8*)
declare i32 @atoi(i8*)
declare i32 @scanf(i8*, ...)
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)
@strps = constant [4 x i8] c"%s\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strspd = constant [4 x i8] c"%lf\00"
@strpi = constant [4 x i8] c"%d\0A\00"
@strs = constant [5 x i8] c"%10s\00"
@strspi = constant [3 x i8] c"%d\00"
define i32 @fun() {
%x = alloca i32
%1 = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32* %x)
%2 = load i32, i32* %x
%3 = add i32 %2, 1
%z = alloca i32
store i32 %3, i32* %z
%4 = load i32, i32* %z
%5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %4)
%fun = alloca i32
store i32 0, i32* %fun
%6 = load i32, i32* %fun
ret i32 %6
}
define i32 @main(){
%1 = call i32 @fun()
ret i32 0 }
