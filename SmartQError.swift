//
//  SmartQError.swift
//  kopo_ios
//
//  Created by Dayyoung on 2020/06/12.
//  Copyright © 2020 Dayyoung. All rights reserved.
//

import Foundation

class SmartQError {
    static let  SUCCESS = ["성공": 1004]
    static let  NO_DATA = ["데이터 없음": 1005]
    static let  NOT_FOUND = ["대상 없음": 1006]
    static let  CANCEL = ["취소": 1007]
    static let  FAIL = ["실패": 1008]
    static let  EXIST_USER = ["등록된 사용자": 1009]
    static let  NOT_EXIST_USER = ["등록되지 않은 사용자": 1010]
    static let  NO_PARAM = ["파라미터 없음": 1010]
}

extension Dictionary {
    func getErrorMessage() -> String {
        let returnKey = Array(self)[0].key //Casting and get.
        return returnKey as! String;
    }
    func getErrorCode() -> String {
        let returnValue : String = String(self.first!.value as! Int) //First and get.
        return returnValue;
    }
}
