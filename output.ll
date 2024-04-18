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
@str1 = constant [4 x i8] c"ala\00"
@a = global i8 0
@str2 = constant [4 x i8] c"ala\00"
define i32 @fun() {
%str2 = alloca [4 x i8]
%1 = bitcast [4 x i8]* %str2 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %1, i8* align 1 getelementptr inbounds ([4 x i8], [4 x i8]* @str2, i32 0, i32 0), i64 4, i1 false)
%ptrstr2 = alloca i8*
%2 = getelementptr inbounds [4 x i8], [4 x i8]* %str2, i64 0, i64 0
store i8* %2, i8** %ptrstr2
%3 = load i8*, i8** @a
%str3 = alloca [7 x i8]
%ptrstr3 = alloca i8*
%4 = getelementptr inbounds [7 x i8], [7 x i8]* %str3, i64 0, i64 0
store i8* %4, i8** %ptrstr3
%5 = load i8*, i8** %ptrstr3
%6 = call i8* @strcpy(i8* %5, i8* %2)
%7 = call i8* @strcat(i8* %5, i8* %3)
%x = alloca i8
store i8* %7, i8** %x
%8 = load i8*, i8** %x
%9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i32 0, i32 0), i8* %8)
%fun = alloca i32
store i32 0, i32* %fun
%10 = load i32, i32* %fun
ret i32 %10
}
define i32 @func() {
%1 = add i32 2, 1
%x = alloca i32
store i32 %1, i32* %x
%2 = load i32, i32* %x
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %2)
%func = alloca i32
store i32 0, i32* %func
%4 = load i32, i32* %func
ret i32 %4
}
@s = global i32 0
define i32 @funcc() {
%1 = load i32, i32* @s
%2 = add i32 %1, 1
%ss = alloca i32
store i32 %2, i32* %ss
%3 = load i32, i32* %ss
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
%funcc = alloca i32
store i32 0, i32* %funcc
%5 = load i32, i32* %funcc
ret i32 %5
}
define i32 @main(){
%str1 = alloca [4 x i8]
%1 = bitcast [4 x i8]* %str1 to i8*
call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %1, i8* align 1 getelementptr inbounds ([4 x i8], [4 x i8]* @str1, i32 0, i32 0), i64 4, i1 false)
%ptrstr1 = alloca i8*
%2 = getelementptr inbounds [4 x i8], [4 x i8]* %str1, i64 0, i64 0
store i8* %2, i8** %ptrstr1
store i8* %2, i8** @a
%3 = call i32 @fun()
%4 = call i32 @func()
%5 = call i32 @fun()
%6 = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strspi, i32 0, i32 0), i32* @s)
%7 = call i32 @funcc()
ret i32 0 }
