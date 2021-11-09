import {Injectable} from '@angular/core';

@Injectable({providedIn:'root'})
export class MessageService{
messages:string[]=[];

add(messageParam:string){
    this.messages.push(messageParam);
}
clear(){
    this.messages=[];
}
}